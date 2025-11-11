package Day_02;

public class ByArray_01 {
  public static class Q {
    int f = -1;
    int r = -1;
    int arr[] = new int[5];
    int size = 0;

    public void add(int val) {
      if (r == arr.length - 1) {
        System.out.println("Queue is full..");
        return;
      }
      if (f == -1) { // queue is currently empty....
        r = f = 0;
        arr[0] = val;
      } else {
        arr[r + 1] = val; // arr[++r];
        r++;
      }
      size++;
    }

    public int remove() {
      if (size == 0) {
        System.out.println("Queue is Empty..");
        return -1;
      }
      int x = arr[f];
      f++;
      size--;
      return x;
    }

    public int peek() {
      if (size == 0) {
        System.out.println("Queue is Empty..");
        return -1;
      }
      return arr[f];
    }

    public boolean isEmpty() {
      if (size == 0)
        return true;
      return false;
    }

    public void Display() {
      if (size == 0) {
        System.out.println("Queue is Empty..");
        return;
      }
      for (int i = f; i<= r; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Q q = new Q();
    q.Display();
    q.add(10);
    q.add(89);
    q.add(100);
    q.Display();
    q.remove();
    q.Display();
    int front = q.peek();
    System.out.println(front);
    System.out.println("size :: "+q.size);

  }
}
