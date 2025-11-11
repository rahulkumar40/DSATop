package StackAll_000;

import java.util.Stack;

public class ReverLinkedList_01 {
    static void reverseLinkedList(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while(st.size()!=0){
            temp.push(st.pop());
        }
        printStack(temp);
    }
    static void printStack(Stack<Integer> st){
        System.out.print("Stack :: ");
        System.out.print(st);
        System.out.println();
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        // original Stack :: 1 2 3 4 5
        printStack(st);
        // reverse Stack :: 5 4 3 2 1 
        reverseLinkedList(st);
    }
}
