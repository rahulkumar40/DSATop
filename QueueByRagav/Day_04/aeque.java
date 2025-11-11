package Day_04;

import java.util.*;

public class aeque {
  public static void main(String[] args) {
    Deque<Integer> dq = new LinkedList<>();

    // add, remove/poll, peek/elemen

    dq.addLast(1);
    dq.addLast(2);
    dq.add(2);
    dq.addLast(3);
    dq.addLast(4);
    dq.addLast(5);
    System.out.println(dq);
    dq.addFirst(8);
    System.out.println(dq);
    dq.removeFirst();
    System.out.println(dq);
    dq.removeLast();
    System.out.println(dq);
    dq.remove(5);
    System.out.println(dq);
    dq.removeFirstOccurrence(2);
    System.out.println(dq);

  }
}
