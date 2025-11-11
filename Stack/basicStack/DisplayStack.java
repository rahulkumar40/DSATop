package basicStack;

import java.util.Stack;

public class DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> org = new Stack<>();
        org.push(1);
        org.push(2);
        org.push(3);
        org.push(4);
        org.push(5);
        org.push(6);
        System.out.println("print stack :: ");
        System.out.println(org);
        
        // another way to print stack 
        while(org.size()!=0){
            System.out.print(org.pop() + " ");
        }
    }
}
