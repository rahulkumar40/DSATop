package Note_01;

import java.util.Stack;

public class CopyStack_02 {
  public static void copy(Stack<Integer> st) {
    Stack<Integer> temp = new Stack<>();
    System.out.println("Org Stack :: " + st);
    while (st.size() != 0) {
      temp.push(st.pop());
    }
    System.out.println("Temp Stack :: " + temp);
    Stack<Integer> ans = new Stack<>();
    while (temp.size() != 0) {
      ans.push(temp.pop());
    }
    System.out.println("Copy Stack :: " + ans);
  }

  public static void copyByRec(Stack<Integer> st) {
    if (st.size() == 0)
      return;
    int top = st.pop();
    copyByRec(st);
    // Stack<Integer> copy = /new Stack<>();
    System.out.println(top);
  }

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);
    copy(st);
    copyByRec(st);
  }
}
