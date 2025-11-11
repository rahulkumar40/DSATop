package Day_1;

public class RestartPractice {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        matrix[0][0] = 10;
        matrix[0][1] = 20;
        matrix[0][2] = 30;
        matrix[1][0] = 40;
        matrix[1][1] = 50;
        matrix[1][2] = 60;
        matrix[2][0] = 70;
        matrix[2][1] = 80;
        matrix[2][2] = 90;

        int row = matrix.length;
        int col = matrix[0].length;
        System.out.println("<-- Coloum wise --> ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("<-- Coloum wise --> ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
