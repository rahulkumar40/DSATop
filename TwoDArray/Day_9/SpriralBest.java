package Day_9;


import java.util.ArrayList;
import java.util.List;

public class SpriralBest {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li=new ArrayList<Integer>();
        int left=0,right=matrix[0].length-1;
        int top=0,bottom=matrix.length-1;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                li.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                li.add(matrix[i][right]);
            }
            right--;
            if(!(top<=bottom && left<=right))
            {
                break;
            }
            for(int i=right;i>=left;i--)
            {
                li.add(matrix[bottom][i]);
            }
            bottom--;
            for(int i=bottom;i>=top;i--)
            {
                li.add(matrix[i][left]);
            }
            left++;
        }
        return li;
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



