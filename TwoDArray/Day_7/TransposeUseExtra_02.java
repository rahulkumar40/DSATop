package Day_7;

public class TransposeUseExtra_02 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2}, {4,6}, {7, 8}};
        int m = matrix1.length; 
        int n = matrix1[0].length; 
        int[][] ans = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                ans[i][j] = matrix1[j][i];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println( );
        }
    }
}
