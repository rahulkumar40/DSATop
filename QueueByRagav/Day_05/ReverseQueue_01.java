package Day_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue_01 {
  public static void reverse(Queue<Integer> q){
    Stack<Integer> st = new Stack<>();
    while (q.size()!=0) {
      st.push(q.remove());
    }
    while (st.size()!=0) {
      q.add(st.pop());
    }
  }
  public static void reverseFirstK(Queue<Integer> q, int k){
    Stack<Integer> st = new Stack<>();
    int n = q.size();
    k = k%n;
    while (q.size()!=k) {
      st.push(q.remove());
    }
    while (st.size()!=0) {
      q.add(st.pop());
    }
  }
  public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<>();
    Stack<Integer> st = new Stack<>();
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    q.add(50);

    System.out.println(q);
    // while (q.size()!=0) {
    //   st.push(q.remove());
    // }
    // while (st.size()!=0) {
    //   q.add(st.pop());
    // }
    reverse(q);
    System.out.println(q);
    reverse(q);
    System.out.println(q);
    reverseFirstK(q,332);
    System.out.println(q); 
  }
}
