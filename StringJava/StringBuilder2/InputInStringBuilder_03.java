package StringBuilder2;

import java.util.Scanner;

public class InputInStringBuilder_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        System.out.println(s); 

        // or 

        String m = sc.nextLine(); 
        StringBuilder k = new StringBuilder(m);
        System.out.println(m);
    }
}
