package LeetCode_503;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeWindowN_Q {
  public static void window(int arr[]) {

    int k = 3;
    int n = arr.length;
    int[] ans = new int[n - k + 1];
    Queue<Integer> q = new LinkedList<>();
    for (int i = 0; i < n - k + 1; i++) {
      if (arr[i] < 0) {
        q.add(i);
      }
    }
    System.out.println(q);
    for (int i = 0; i < n - k + 1; i++) {
      if (q.size() > 0 && q.peek() < i)
        q.remove();

      if (q.size() > 0 && q.peek() <= i + k - 1) {
        ans[i] = arr[q.peek()];
      } else if (q.size() == 0) {
        ans[i] = 0;
      } else
        ans[i] = 0;
    }
    printA(ans);
  }

  public static void printA(int arr[]) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int a[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
    printA(a);
    window(a);
    printA(a);
  }
}
