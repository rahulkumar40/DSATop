package Day_03;

class Cqa {
  int f = -1;
  int r = -1;
  int size = 0;
  int[] arr = new int[5];

  public void add(int val) throws Exception {
    if (size == arr.length) {
      throw new Exception("Queue is full");
    } else if (size == 0) {
      f = r = 0;
      arr[0] = val;
      // return;
    } else if (r < arr.length - 1) {
      arr[++r] = val;
    } else if (r == arr.length - 1) {
      r = 0;
      arr[0] = val;
    }
    size++;
  }

  public int remove() throws Exception {
    if (size == 0) {
      throw new Exception("Queue is Empty..");
    } else {
      int val = arr[f];
      if (f == arr.length - 1) {
        f = 0;
      } else
        f++;
      size--;
      return val;
    }
  }

  public int peek() throws Exception {
    if (size == 0) {
      throw new Exception("Queue is Empty!");
    } else
      return arr[f];
  }

  public boolean isEmpty() {
    if (size == 0)
      return true;
    return false;
  }

  public void display() {
    if (size == 0) {
      System.out.println("Queue is Empty.");
      return;
    } else if (f <= r) {
      for (int i = f; i <= r; i++) {
        System.out.print(arr[i] + " ");
      }
    } else { // r<f
      for (int i = f; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
      for (int i = f; i <= r; i++) {
        System.out.print(arr[i] + " ");
      }
    }
    System.out.println();
  }
}

public class CircularQueueArr {
  public static void main(String[] args) throws Exception {
    Cqa q = new Cqa();
    q.display();
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    q.display();
    q.remove();
    q.display();
    q.add(50);
    q.display();
    for (int i = 0; i < q.arr.length; i++) {
      System.out.print(q.arr[i] + " ");
    }
    System.out.println();
  }

}
