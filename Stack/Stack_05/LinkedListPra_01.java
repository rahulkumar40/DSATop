package Stack_05;

class Node {
    int val ;
    Node next ;
    Node(int val){
        this.val = val;
    }
}
class Stack{
    Node head = null;
    int size = 0;
    void push(int val){
        Node temp = new Node(val);
            if(head==null){
                head = temp;
            }
            else{
                temp.next = head;
                temp = head;
            }
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
public class LinkedListPra_01 {
    public static void main(String[] args) {
        Stack lis = new Stack();
        lis.push(4);
        lis.push(45);
        lis.display();
    }
}
