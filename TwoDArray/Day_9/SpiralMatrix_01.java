package Day_9;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_01{
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>(); 
        int m = arr.length, n = arr[0].length;


        int minr = 0, maxr=m-1;
        int minc = 0, maxc = n-1;

        while (minr<=maxr && minc <=maxc) {
            // left to tright 
            for(int j=minc; j<=maxc; j++){
                ans.add(arr[minr][j]);
            }minr++;
            // top to bottom 
            if(minr>maxr || minc>maxc)break;
            for(int i=minr; i<=maxr; i++){
                ans.add(arr[i][maxc]);
            }maxc--;
            // right to left 
             if(minr>maxr || minc>maxc)break;
            for(int j=maxc; j>=minc; j--){
                ans.add(arr[maxr][j]);
            }maxr--;
             if(minr>maxr || minc>maxc)break;
            for(int i=maxr; i>=minr; i--){
                ans.add(arr[i][minc]);
            }minc++;  
    
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3}, {2, 0, 1}, {2, 3, 1}};
        print(a);
        SpiralMatrix_01 sc = new SpiralMatrix_01();
        List<Integer> ans = sc.spiralOrder(a);
        
        System.out.println(ans);
    }
    static void print(int c[][]){
        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[0].length; j++){
                System.out.print( c[i][j] + " ");
            }
            System.out.println( );
        }
        System.out.println( );
    }
}

