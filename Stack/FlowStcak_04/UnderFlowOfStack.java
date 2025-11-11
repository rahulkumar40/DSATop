package FlowStcak_04;

import java.util.Stack;

public class UnderFlowOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(5);
        while(st.size()!=0){
            System.out.println(st);
            st.pop();
        }
        System.out.println(st.pop());
        
    }
}
