package Day_02;

class Node {
  int val;
  Node next;

  Node(int val) {
    this.val = val;
  }
}

class Q { // user define data structure....... to implement the queue---->
  Node head = null;
  Node tail = null;
  int size = 0;

  public void add(int val) {
    Node temp = new Node(val);
    if (head == null) {
      head = tail = temp;
    } else {
      tail.next = temp;
      tail = temp;
    }
    size++;
  }

  public int remove() {
    if (size == 0) {
      System.out.println("Queue is Empty..");
      return -1;
    }
    int x = head.val;
    head = head.next;
    size--;
    return x;
  }

  public int peek() {
    if (size == 0) {
      System.out.println("Queue is Empty..");
      return -1;
    }
    return head.val;
  }

  public int size() {
    if (size == 0) {
      System.out.println("Queue is Empty..");
      return -1;
    }
    return size;
  }

  public boolean isEmpty() {
    if (size == 0) {
      return true;
    }
    return false;
  }

  public void display() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }
    System.out.println();
  }
}

public class ByLinkedList {
  public static void main(String[] args) {
    Q q = new Q();
    q.display();
    ;
    System.out.println("Is Empty :: " + q.isEmpty());
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    q.add(50);
    q.add(60);
    q.display();
    System.out.println(q.remove());
    q.display();
    System.out.println("Peek :: " + q.peek());
    System.out.println("Size :: " + q.size());
    System.out.println("Is Empty :: " + q.isEmpty());
    q.add(49384);
    q.display();

  }
}
