package StackAll_000;

import java.util.*;
public class PushAtIdxOr_03 {
    static void pirntStack(Stack<Integer> stack){
        System.out.println("Stack :: "+stack);
        System.out.println( );
    }
    static void pushAtBottom(Stack<Integer> st, int eleemnt){
        Stack<Integer> temp = new Stack<Integer>();
        while(st.size()!=0){
            temp.push(st.pop());
        }
        st.push(eleemnt);
        while(temp.size()!=0){
            st.push(temp.pop());
        }
        pirntStack(st);
    }
    static void pushAtIdx(Stack<Integer> st, int eleemnt, int idx){
        Stack<Integer> temp = new Stack<Integer>();
        while(st.size()!=idx){
            temp.push(st.pop());
        }
        st.push(eleemnt);
        while(temp.size()!=0){
            st.push(temp.pop());
        }
        pirntStack(st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        pirntStack(st);

        pushAtBottom(st, 90);
        pushAtIdx(st, 12, 3);
    }
}
