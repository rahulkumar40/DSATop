package Day_7;

public class Transpose_01 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3}, {4,6,7}, {7, 8,9}};

        int m = matrix1.length; 
        int n = matrix1[0].length; 
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                    int temp = matrix1[i][j];
                    matrix1[i][j] = matrix1[j][i];
                    matrix1[j][i] = temp;
            }
        }

        for(int i=0; i<m; i++){
            int low =0, high = n-1;
            // swap arr[i][a] and arr[i][b]
            while (low<high) {
                int temp = matrix1[i][low];
                matrix1[i][low] = matrix1[i][high];
                matrix1[i][high] = temp;
                low++;
                high--;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println( );
        }
    }
}
