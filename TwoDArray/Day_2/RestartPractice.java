package Day_2;

import java.util.Scanner;

public class RestartPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows Size ");
        int row = sc.nextInt();
        System.out.println("Enter Column Size ");
        int col = sc.nextInt();
        int [][]matrix = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
            System.out.println( );
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println( );
        }
    }
}
