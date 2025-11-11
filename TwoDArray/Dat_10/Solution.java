package Dat_10;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6},{7, 8, 9}};
        Solution a = new Solution();
        a.spiralOrder(arr);
    }
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
    
}
