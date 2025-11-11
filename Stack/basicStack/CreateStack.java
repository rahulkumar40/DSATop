package basicStack;

/**
 * CreateStack
 */

 import java.util.*;
public class CreateStack {
    // void printStartIdx(Stack st , int idx ){
    //     while (st != idx) {
    //         st.pop();
    //     }3
    // }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        
        // Print the stack 
        System.out.println(st);
        System.out.println("Pop the 1st head ");
        st.pop();
        System.out.println(st);

        // print stack peek 
        System.out.println("Print peek");
        System.out.println(st.peek());
        System.out.println("Real size of stack after operation. ");
        System.out.println(st);
        System.out.println( );

        // size of stack 
        System.out.println("size of stack.");
        System.out.println( );
        System.out.println(st.size());
        st.push(90);
        st.push(89);
        System.out.println(st);
        System.out.println( );
        while(st.size()!=1){  // st.size() > 1 also 
            st.pop();
        }
        System.out.println("First Element of stack." + st);


    }
    
}