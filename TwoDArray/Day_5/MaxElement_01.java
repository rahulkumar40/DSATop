 // write a program to find the maximum element into the 2D arrat : 
package Day_5;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] = sc.nextInt(); 
            }
        }
        System.out.println( );
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println( );
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j] > max ){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max element : " + max);
    }
}
