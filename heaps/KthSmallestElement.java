import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int arr[] = { -3, -5, -34, 5, 35, 24, -67, 79 };
        int k = 5;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
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
