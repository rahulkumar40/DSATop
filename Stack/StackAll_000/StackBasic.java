package StackAll_000;

import java.util.*;

public class StackBasic {
    static void firstElement(Stack<Integer> st){
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st);
    }
    static void printStack(Stack<Integer> st){
        System.out.print("Stacke   :: ");
        System.out.print(st);
        System.out.println();
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();

        // push() operation: 
        st.push(5);
        st.push(3);
        st.push(4);
        st.push(53);
        st.push(36);
        printStack(st);

        System.out.println();
        // pop() opertain:  
        int k = st.pop();
        printStack(st);
        System.out.println("poped Element is :: "+ k);
        System.out.println( );

        // peek()  opretaion: to find peak element inside the stack 
        System.out.println("Peak eleemnt is :: "+ st.peek());
        System.out.println( );

        // size() operation:
        printStack(st);
        System.out.println("Size of Stack :: "+st.size()); 
        System.out.println( );
        
        // print first element.
        printStack(st);
        System.out.println("Size of Stack :: "+st.size()); 
        firstElement(st);
        System.out.println("Size of Stack :: "+st.size()); 

        

    }
}
