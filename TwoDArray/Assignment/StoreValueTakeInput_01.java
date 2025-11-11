// Write a program to store 10 at every index of a 2D matrix with 5 rows and 5 column.
/*
10 10 10 10 10 
10 10 10 10 10
10 10 10 10 10
10 10 10 10 10
10 10 10 10 10
 */
package Assignment;

import java.util.Scanner;

public class StoreValueTakeInput_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][5];
        System.out.println("Enter the 2D array Index : ");
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                arr[i][j] = 10;
            }
        }
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(arr[i][j]+  " ");
                //  arr[i][j] = sc.nextInt();
            }
            System.out.println( );
        }
    }
}
