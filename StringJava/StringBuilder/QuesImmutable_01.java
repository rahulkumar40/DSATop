package StringBuilder;

import java.util.Scanner;

public class QuesImmutable_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine(); 

        System.out.println("This updated String at even == a : ");

        String t = "";
        for(int i=0; i<s.length(); i++){
            if(i%2 == 0){
                t = t + "a";
            }
            else{
                t = t+ s.charAt(i);
            }
        }

        System.out.println(t);
    }
}
