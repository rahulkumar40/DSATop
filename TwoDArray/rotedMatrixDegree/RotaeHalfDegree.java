package rotedMatrixDegree;

// Rotate a Matrix by 180 degree 
/*
 * Given a square matrix and roated the matrix by 180 degree 
 */
public class RotaeHalfDegree {
    static void display(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void swap(int mat[][], int current, int left, int right) {
        int temp = mat[current][left];
        mat[current][left] = mat[current][right];
        mat[current][right] = temp;
    }

    static void rotedMatrix(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int left = 0;
                int right = row - 1;
                swap(matrix, i, left, right);
            }
        }
        System.out.println("Rotate left to right ");
        display(matrix);

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                int left = 0, right = row - 1;
                swap(matrix, j, left, right);
            }
        }
        System.out.println("180 degree Rotated ");
        display(matrix);
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Original Matrix : ");
        display(matrix);
        System.out.println("Roted Array ");
        rotedMatrix(matrix);
    }
}
