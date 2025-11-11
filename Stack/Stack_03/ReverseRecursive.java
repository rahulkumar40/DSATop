package Stack_03;

import java.util.Stack;

public class ReverseRecursive {
    void printRe(Stack<Integer> st){
        if(st.isEmpty()) return;
        int temp = st.pop();
        System.out.println(temp);
        printRe(st);
        st.push(temp);

    }
    void printsS(Stack<Integer> st){
        if(st.isEmpty()) return;
        int temp = st.pop();
        printRe(st);
        System.out.print(temp+ " ");
        st.push(temp);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println( );
        System.out.println(st);
        ReverseRecursive s = new ReverseRecursive();
        s.printsS(st);
        System.out.println("REverse Call ");
        s.printRe(st);
        System.out.println( );

        // int am = 7;
        // System.out.print(am++);
        // System.out.println( );
        // int ams = 7;
        // System.out.println(am);
        // System.out.print(++ams);
        // System.out.println(ams);
    }
}
