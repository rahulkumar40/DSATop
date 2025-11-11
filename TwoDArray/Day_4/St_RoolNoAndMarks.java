package Day_4;

import java.util.Scanner;

public class St_RoolNoAndMarks {
    
    public static void main(String[] args) {
        int[][] studen = new int[4][2];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<4; i++){
            System.out.println("Enter the " + (i+1 )+ " Rool Number & Marks");
            for(int j=0; j<2; j++){
                studen[i][j] = sc.nextInt();
            }
        }
        System.out.println("Rooll Number      Marks");
        for(int i=0; i<4; i++){
            for(int j =0; j<2; j++){
                System.out.print(studen[i][j] + "         ");
            }
            System.out.println( );
        }
    }
}
