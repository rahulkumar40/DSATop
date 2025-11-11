package Day_01;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BasicCollectionFramWork {
  public static void main(String[] args) {
    Queue<Integer>  q = new ArrayDeque<>();
    Queue<Integer>  qq = new LinkedList<>();

    System.out.println(q.isEmpty());
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);

    // remove opeation. ===> queue.remove() or queue.poll();
    q.remove();
    System.out.println(q);
    q.poll();

    // peek element --> queue.peek() or element();

    System.out.println(q.element());

    // size operation --> queue.size();
    System.out.println(q);
    System.out.println(q);
    System.out.println( );
    while (q.size()!=0) {
      int k = q.peek();
      System.out.print(k + " ");
      qq.add(k);
      q.remove();
    }
    System.out.println(qq);
    System.out.println( );
    System.out.println(q);
  }
}
