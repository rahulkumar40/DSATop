package Note_03;

class Node{
  int val ;
  Node next;
  Node(int val){
    this.val = val;
  }
}
class LL{
  Node head = null;
  void push(int val){
    Node temp = new Node(val);
    if(head==null){
      head = temp;
    }
    else{
      head.next = temp;
      temp = head;
    }
  }
  void dis(){
    Node temp = head;
    while (temp!=null) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }
  }
}
public class StackByLinkedList_02 {
  public static void main(String[] args) {
    LL st = new LL();
    st.push(4);
    st.push(5);
    st.dis();
  }
}
