package Day_09;

import java.util.Scanner;

public class TakeInputToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer : ");
        int n = sc.nextInt();

        String m = " ";
        m = m + n;
        System.out.println("This is converted integer : "+m);

    }
}
