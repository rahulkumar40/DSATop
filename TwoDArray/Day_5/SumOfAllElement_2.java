package Day_5;

import java.util.Scanner;

public class SumOfAllElement_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int sum = 0;
        System.out.println("Enter array element : ");

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
        int mx = arr[0][0];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                    sum += arr[i][j];
                    mx = Math.max(mx, arr[i][j]);
                }
        }
        System.out.println("Sum of element : " + sum);
        System.out.println("mx  element    : " + mx);


    }
}

