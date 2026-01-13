import java.util.Collections;
import java.util.PriorityQueue;

public class kthLargestElement {
     public static void main(String[] args) {
        int arr[] = { 5, 35, 24, -67, 79,484,332,33,223,433,543,543 };
        int k = 5;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i : arr) {
            pq.add(i);
        }

        for (int i = 1; i <= k - 1; i++) {
            pq.remove();
        }

        for (int i : arr) {
            p.add(i);
            if (p.size() >=k)
                p.remove();
        }
        System.out.println(p.peek());
        System.out.println(pq.peek());
    }
}
