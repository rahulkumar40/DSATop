package basicStack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.print("Original Stack ::  ");
        System.out.println(st);
        System.out.println();

        Stack<Integer> rSt = new Stack<>();
        while (st.size()!=0) {
            int element = st.pop();
            rSt.push(element);
        }
        System.out.print("Reversed Stack ::  ");
        System.out.println(rSt);
        System.out.println(rSt.size());
    }
}
