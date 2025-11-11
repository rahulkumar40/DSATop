package Day_01;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Display_01 {
  public static void main(String[] args) {
    Queue<Integer>  q = new ArrayDeque<>();
    Queue<Integer>  helper = new LinkedList<>();

    System.out.println(q.isEmpty());
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    while (q.size()!=0) {
      System.out.print(q.peek() + " ");
      helper.add(q.poll());
    }
    while(helper.size()!=0) {
      q.add(helper.poll());
    }
    System.out.println(q);
  }
}
