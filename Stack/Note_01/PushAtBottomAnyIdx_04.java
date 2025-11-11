package Note_01;

import java.util.Stack;

public class PushAtBottomAnyIdx_04 {
  public static void pushAtBottom(Stack<Integer> st, int val) {
    Stack<Integer> temp = new Stack<>();

    while (st.size() != 0) {
      int top = st.pop();
      temp.push(top);
    }

    st.push(val);
    while (temp.size() != 0) {
      st.push(temp.pop());
    }

    System.out.println(st);

  }

  public static void pushAtIdx(Stack<Integer> st, int idx, int val) {
    Stack<Integer> temp = new Stack<>();
    while (st.size() != idx) {
      temp.push(st.pop());
    }
    st.push(val);
    while (temp.size() != 0) {
      st.push(temp.pop());
    }

    System.out.println(st);
  }

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    pushAtBottom(st, 50);
    pushAtBottom(st, 0);

    pushAtIdx(st, 2, 40);
  }
}
