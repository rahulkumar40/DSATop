package Note_02;

import java.util.Stack;

public class RemoveAtByRecursion_02 {
  public static void removeAtBottom(Stack<Integer> st) {
    if (st.size() == 1) {
      st.pop();
      return;
    }
    int top = st.pop();
    removeAtBottom(st);
    st.push(top);
  }

  public static void removeAtIdx(Stack<Integer> st,int  idx) {
    if (st.size() == idx) {
      st.pop();
      return;
    }
    int top = st.pop();
    removeAtIdx(st, idx);
    st.push(top);
  }

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);

    System.out.println("Befor :: ");
    System.out.println(st);
    removeAtBottom(st);
    System.out.println("After :: ");
    System.out.println(st);

    removeAtIdx(st, 2);
    System.out.println(st);

  }

}
