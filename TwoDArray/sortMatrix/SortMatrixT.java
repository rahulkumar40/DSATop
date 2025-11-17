import java.lang.reflect.Array;
import java.util.Arrays;

public class SortMatrixT {
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

    static int[][] sortMat(int matrix[][]) {
        int row = matrix.length;
        int col = matrix[0].length;
        int matrixArr[] = new int[(row * col)];
        int arrIdx = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                matrixArr[arrIdx] = matrix[i][j];
                arrIdx++;
            }
        }
        Arrays.sort(matrixArr);
        arrIdx = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j] = matrixArr[arrIdx];
                arrIdx++;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 4, 5 }, { 2, 5, 1 }, { 8, 7, 3 } };
        System.out.println("Original Matrix ");
        display(matrix);
        int sortedMatrix[][] = sortMat(matrix);
        System.out.println("Sorted Matrix ");
        display(sortedMatrix);
    }
}
