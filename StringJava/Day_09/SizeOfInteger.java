package Day_09;

import java.util.Scanner;

public class SizeOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer : ");
        int n = sc.nextInt();

        String m = "" + n;
        System.out.print("Size of integer : ");
        System.out.println(m.length());

        String k = Integer.toString(n);
        System.out.println(k);
    }
}
