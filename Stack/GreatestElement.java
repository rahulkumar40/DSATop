import java.util.Stack;

public class GreatestElement {
  public static void show(int arr[]) {
    Stack<Integer> st = new Stack<>();

    int n = arr.length;
    // create a new answer array.
    int ans[] = new int[n];
    st.push(arr[n - 1]);
    ans[n - 1] = -1;
    for (int i = n - 2; i >= 0; i--) {
      while (!st.isEmpty() && st.peek() < arr[i]) {
        st.pop();
      }
      if (st.size() == 0)
        ans[i] = -1;
      else if (st.peek() > arr[i])
        ans[i] = st.peek();
      st.push(arr[i]);
    }
    printArr(ans);
  }

  public static void printArr(int arr[]) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int arr[] = { 45, 34, 39, 50, 20, 100, 30, 56 };
    show(arr);
    printArr(arr);

  }
}
