package Day_2;

import java.util.Scanner;

public class InputOutput_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][4];

        // input of 2D array 
        // for(int i=0; i<3; i++){
        //     System.out.println("Enter element of  " + i + " th row : ");
        //     for(int j=0; j<4; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }

        // // printing of 2D array 
        // for(int i=0; i<3; i++){
        //     for(int j=0; j<4; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println( );
        // }

        // length method for 2D array : 
        // arr.length : : it is for the row size 
        int m = arr.length; 
        int n = arr[0].length; 
        System.out.println("rows size : "+ m);
        System.out.println("coloums size : " + n);


        // input of 2D array 
        for(int i=0; i<m; i++){
            System.out.println("Enter element of  " + i + " th row : ");
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // printing of 2D array 
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println( );
        }
    }

}
