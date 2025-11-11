package Day_03;

class Node{
  int val ;
  Node next;
  Node(int val){
    this.val = val;

  }
}
class LQ{
  Node head = null;
  Node tail = null;
  int size = 0;
  public void add(int val){
    Node temp = new Node(val);
    if(head==null){
      head=tail=temp;
    }
    else{
      tail.next=temp;
      tail = temp;
      tail.next = head;
    }
    size++;
  }

  public int remove() throws Exception{
    if(size==0){
      throw new Exception("Stack is Empty!");
    }
    int front = head.val;
    head = head.next;
    tail.next = head;
    size--;
    return front;
  }

  public int peek() throws Exception{
    if(size==0){
      throw new Exception("Queue is Empty..");
    }
    return head.val;
  }
  public boolean isEmpty(){
    System.out.print("Queue is Empty --> ");
    if(size==0){
      return true;
    }
    return false;
  }

  public void display(){
    if(size==0){
      System.out.println("Queue is Empty!");
      return;
    }
    Node temp = head;
    while (temp!=null) {
      System.out.print(temp.val + " ");
      temp = temp.next;
      if(temp==tail.next) break;
    }
    System.out.println( );
  }
}


public class ByLinkedList {
  public static void main(String[] args) throws Exception {
    LQ q = new LQ();
    System.out.println(q.isEmpty());
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    q.display();
    System.out.println(q.isEmpty());
    q.remove();
    q.remove();
    System.out.println(q.remove());
    q.display();
    q.remove();

    q.display();
  }
}
