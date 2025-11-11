package Stack_05;

public class ImplementationOfLinkedList {
    public static class Stack{
        int arr[] = new int[5];
        int idx = 0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is full.");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        void pop(){
            int x = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            System.out.println("Pop Element :: "+x);
        }
        void display(){
            for(int i:arr){
                System.out.print(i + " ");
            }
            System.out.println( );
        }
        void peek(){
            if(idx==arr.length){
                System.out.println(arr[idx]);
                return;
            }
        }
        void size(){
            System.out.println("Size of Stack. ::  "+idx);
        }
        boolean isFull(){
            if(idx == arr.length){
                return true;
            }
            return false;
        }
        boolean isEmpty(){
            if(idx==0){
                return true;
            }
            return false;
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(8);
        st.push(89);
        st.push(847);
        st.push(484);
        st.push(443);
        st.display();
        st.pop();
        st.display();
        st.size();
        System.out.println(st.isEmpty());
        st.push(8474);
        st.display();
        st.peek();
    }

}
