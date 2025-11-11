package Day_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueue {
  public static void reorder(Queue<Integer> q) {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> s = new Stack<>();

    int n = q.size();
    for (int i = 0; i < n / 2; i++) {
      st.push(q.remove());
    }
    while (st.size() != 0) {
      s.push(st.pop());
    }
    // for (int i = 0; i < n / 2; i++) {
    //   st.push(q.remove());
    // }
    // while (st.size() != 0) {
    //   s.push(st.pop());
    // }
    for (int i = 0; i < n / 2; i++) {
      q.add(s.pop());
      q.add(q.remove());
    }


    System.out.println(q);
  }

  public static void reorderQ(Queue<Integer> q) {
    int n = q.size();
    Stack<Integer> st = new Stack<>();

    for (int i = 0; i < n / 2; i++) {
      st.push(q.remove());
    }
    while (st.size() != 0) {
      q.add(st.pop());
    }
    for (int i = 0; i < n / 2; i++) {
      st.push(q.remove());
    }
    for (int i = 0; i < n / 2; i++) {
      q.add(st.pop());
      q.add(q.remove());
    }
    for (int i = 0; i < n; i++) {
      st.push(q.remove());
    }
    while (st.size() != 0) {
      q.add(st.pop());
    }
    System.out.println(q);
  }

  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);
    q.add(7);
    q.add(8);
    System.out.println(q);
    // reorderQ(q);
    reorder(q);

  }
}
