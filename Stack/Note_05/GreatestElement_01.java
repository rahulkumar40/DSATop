package Note_05;

import java.util.Stack;

public class GreatestElement_01 {
  public static void ans(int arr[]) {
    int n = arr.length;
    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = -1;
    }

    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        if (arr[i] < arr[j]) {
          a[i] = arr[j];
          break;
        }
      }
    }
    print(a);
  }

  static void greatest(int arr[]) {
    Stack<Integer> st = new Stack<>();
    int n = arr.length;
    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = -1;
    }
    st.push(arr[n - 1]);
    a[n - 1] = -1;
    for (int i = n - 2; i >= 0; i--) {
      while (!st.isEmpty() && st.peek() <= arr[i]) {
        st.pop();
      }
      if (st.size() == 0)
        a[i] = -1;
      else {
        a[i] = st.peek();
      }
      st.push(arr[i]);
    }
    print(a);

  }

  static void print(int a[]) {
    for (int i : a) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = { 3, 5, 6, 7, 8, 2, 8, 2, 10, 15 };
    print(arr);
    // ans(arr);
    greatest(arr);
  }
}
