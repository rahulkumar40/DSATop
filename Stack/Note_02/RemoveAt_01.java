package Note_02;

import java.util.Stack;

public class RemoveAt_01 {
  void removeAtBottom(Stack<Integer> st) {
    Stack<Integer> temp = new Stack<>();
    while (st.size() != 1) {
      temp.push(st.pop());
    }
    st.pop();

    while (temp.size() != 0) {
      st.push(temp.pop());
    }
    System.out.println(st);
  }

  void removeAtIdx(Stack<Integer> st, int idx) {
    Stack<Integer> temp = new Stack<>();
    while (st.size() != idx) {
      temp.push(st.pop());
    }
    st.pop();
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
    st.push(50);
    RemoveAt_01 t = new RemoveAt_01();
    t.removeAtBottom(st); // [20, 30, 40, 50]
    t.removeAtIdx(st, 3); // [10, 20, 50]

  }
}
