import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class BasicHeapsCollectionFram {
    public static void main(String[] args) {
        // min prorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        System.out.println("PriorityQueue = " + pq + " Peek Element" + pq.peek());
        pq.add(10);
        System.out.println("PriorityQueue = " + pq + " Peek Element" + pq.peek());
        pq.add(1);
        System.out.println("PriorityQueue = " + pq + " Peek Element" + pq.peek());
        pq.remove();
        System.out.println("PriorityQueue = " + pq + " Peek Element" + pq.peek());
        pq.add(0);
        System.out.println("PriorityQueue = " + pq + " Peek Element" + pq.peek());

        // max prorityQueue
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        p.add(2);
        System.out.println("PriorityQueue = " + p + " Peek Element" + p.peek());
        p.add(10);
        System.out.println("PriorityQueue = " + p + " Peek Element" + p.peek());
        p.add(1);
        System.out.println("PriorityQueue = " + p + " Peek Element" + p.peek());
        p.remove();
        System.out.println("PriorityQueue = " + p + " Peek Element" + p.peek());
        p.add(0);
        System.out.println("PriorityQueue = " + p + " Peek Element" + p.peek());

    }
}
