package Note_01;

import java.util.Stack;

public class PushAtByRecursion_05 {
  public static void addAtBottom(Stack<Integer> st, int val) {
    if (st.size() == 0) {
      st.push(val);
      return;
    }
    int top = st.pop();
    addAtBottom(st, val);
    st.push(top);
  }

  public static void addAtIdx(Stack<Integer> st, int val, int idx) {
    if (st.size() == idx) {
      st.push(val);
      return;
    }
    int top = st.pop();
    addAtIdx(st, val ,idx);
    st.push(top);
  }

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    System.out.println(st);
    addAtBottom(st, 48);
    System.out.println(st);

    addAtIdx(st, 0, 3);
    System.out.println(st);
  }
}
