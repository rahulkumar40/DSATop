package basicStack;

import java.util.*;
public class CopyStackInAnother {
    public static void main(String[] args) {
        Stack<Integer> org = new Stack<>();
        org.push(1);
        org.push(2);
        org.push(3);
        org.push(4);
        org.push(5);
        org.push(6);
        System.out.print("Original Stack ::  ");
        System.out.println(org);
        System.out.println( );
        Stack<Integer> temp = new Stack<>();
        while (org.size()!=0) {
            temp.push(org.pop());
        }
        System.out.print("Temporary Stack ::  ");
        System.out.println(temp);
        System.out.println( );

        Stack<Integer> finl = new Stack<>();
        while(temp.size()!=0){
            finl.push(temp.pop());
        }
        System.out.print("Copy Stack KK ::  ");
        System.out.println(finl);

    }
}
