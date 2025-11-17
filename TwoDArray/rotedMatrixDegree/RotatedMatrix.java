package rotedMatrixDegree;

public class RotatedMatrix {
    static void display(int matrix[][]) {
        int col = matrix.length;
        int row = matrix[0].length;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // System.out.println();
    }

    static void swap(int arr[][], int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    static int[][] transposeMat(int matrix[][]) {
        int col = matrix.length;
        int row = matrix[0].length;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < i; j++) {
                swap(matrix, i, j);
            }
        }
        return matrix;
    }

    static void rowSwap(int[][] matrix, int row, int left, int right) {
    int temp = matrix[row][left];
    matrix[row][left] = matrix[row][right];
    matrix[row][right] = temp;
}


    static int[][] clockWiseRotated(int matrix[][]) {
        int col = matrix.length;
        int row = matrix[0].length;
        for (int i = 0; i < col; i++) {
            int left = 0;
            int right = row - 1;

            while (left < right) {
                rowSwap(matrix, i, left, right);
                left++;
                right--;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Original Matrix ");
        display(matrix);
        int tranposeMatrix[][] = transposeMat(matrix);
        System.out.println("Transpose Matrix ");
        display(tranposeMatrix);

        // row reverse ;
        System.out.println("90 degree roated Matrix ");

        int clockWiseMatrix[][] = clockWiseRotated(tranposeMatrix);
        display(clockWiseMatrix);
    }
}
