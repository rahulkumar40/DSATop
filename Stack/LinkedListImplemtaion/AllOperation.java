package LinkedListImplemtaion;

class Node {
    int val ;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class LinkeListt{
    Node head;
    Node tail;
    int size;
    void insertAtTail(int val){
        Node temp = new Node(val);
        if(head==null){
            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null){
            head = temp;
            tail = temp;
        }
            temp.next = head;
            head = temp;
        size++;
    }
    void insertAtIdx(int idx , int val){
        Node x = head;
        Node temp = new Node(val);
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx>=size && idx<0){
            System.out.println("Invalid index.");
            return;
        }
        for(int i=1; i<idx; i++){
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.val + " ");
            temp=temp.next;
        }
        System.out.println( );
    }
}
public class AllOperation {
    public static void main(String[] args) {
        LinkeListt list = new LinkeListt();
        list.insertAtTail(19);
        list.insertAtTail(2);
        list.insertAtTail(24);
        list.insertAtTail(565);
        list.display();
        list.insertAtHead(48);
        list.display();
        System.out.println(list.size);
        list.insertAtIdx(3,958);
        list.display();
        
    }
}
