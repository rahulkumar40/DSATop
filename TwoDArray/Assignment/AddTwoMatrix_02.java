package Assignment;

public class AddTwoMatrix_02 {
    static void printM(int arr[][]){
        int m = arr.length;
        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println( );
        }
    }
    public static void main(String[] args) {
        int matrix_1[][] = {{1, 2, 4}, {3, 4, 6}, {5, 6, 7}};
        int matrix_2[][] = {{10, 22, 14}, {3, 3, 6}, {50, 6, 70}};

        int m = matrix_1.length; 
        int n = matrix_2.length;
        int ansMatrix[][] = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<m; j++){
                ansMatrix[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }

        System.out.println("Original Matrix1 & Matrix2 : ");
        printM(matrix_1);
        System.out.println( );
        printM(matrix_2);
        System.out.println("Output of the matrix : ");
        printM(ansMatrix);
    }
}
