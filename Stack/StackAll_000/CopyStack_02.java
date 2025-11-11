package StackAll_000;

import java.util.*;

public class CopyStack_02 {
    static void pirntStack(Stack<Integer> stack){
        System.out.println("Stack :: "+stack);
        System.out.println( );
    }

    static Stack<Integer> change(Stack<Integer> st){
        Stack<Integer> temp = new Stack<Integer>();
        while(st.size()!=0){
            temp.push(st.pop());
        }
        return temp;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        pirntStack(st);
        // st == org 
        Stack<Integer> a = change(st);
        pirntStack(a);
        Stack<Integer> b = change(a);
        pirntStack(b);
    }
}
