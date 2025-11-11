package Day_07;

import java.util.Scanner;

public class QuestionONThis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String value : ");
        int count = 0;
        String x = sc.nextLine();
        for(int i=0; i<x.length(); i++){
            for(int j=i+1; j<x.length(); j++){
                String d = x.substring(i, j);
                System.out.print(d + " ");
                count++;
            }
            System.out.println( );
        }
        System.out.println("\nTotal number of substring : "+ count);
    }
}
