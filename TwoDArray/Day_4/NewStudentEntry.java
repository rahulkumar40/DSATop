package Day_4;

import java.util.Scanner;

public class NewStudentEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[4][2];
        int m = arr.length; 
        int n = arr[0].length; 
        System.out.println("Enter the Roll Number & marks of student : ");
        for(int i=0; i<m; i++){
            System.out.print("Student " + i + " . ");
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt(); 
            }
        }

        System.out.println("Roll Number      Marks  ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + "          ");
            }
            System.out.println( );
        }
    }
}
