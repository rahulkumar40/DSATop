package Stack_05;

public class LinkedListThrough {
    public static class Node{
        int val ;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class Stack{
        Node head = null;
        int size = 0; 
        void push(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }
        void pop(){
            if(head == null){
                System.out.println("Stack is empty.");
                return;
            }
            int x = head.val;
            head = head.next;
            System.out.println("Poped Head :: "+x);
            size--;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+ " ");
                temp = temp.next;
            }
        }
        void displayR(Node head){
            if(head==null) return;
            displayR(head.next);
            System.out.print(head.val+" ");
        }
        void size(){
            System.out.println(size);
        }
        void peek(){
            if(head==null){
                System.out.println("Stack is empty.");
                return;
            }
            int x = head.val;
            System.out.println(x);
        }
        boolean isEmpty(){
            if(head==null){
                return true;
            }
            return false;
        }
        void dis(){
            displayR(head);
            System.out.println( );
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.dis();
        System.out.println( );
        st.size();
        st.pop();
        st.size();
        st.dis();
        st.peek();
        System.out.println(st.isEmpty());

        int arr[] = {2, 4, 6, 7};
        // 2 + 7 :: a = {0, 3};
        int target = 6;
        int a[] = {-1, -1};

        int i=0, j=arr.length-1;
        while (i<j) {
            if(arr[i] + arr[j] < target){
                j--;
            }
            if(arr[i] + arr[j] > target){
                i++;
            }
            if(arr[i] + arr[j] == target){
                a[0] = i;
                a[1] = j;
                break;
            }
        }
        for(int k:a){
            System.out.println(k);
        }
    }
}
