package Stack_05;

public class ImplementStackWithArray {
    public static class Stack{
        private int arr[] = new int[5];
        private int idx = 0;
        
        void push(int x){
            if(isful()){
                System.out.println("Stack is full.");
            }
                arr[idx] = x;
                idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("The Stack is empty.");
                return -1;
            }
            return arr[idx-1];
        }
        void display(){
            for(int i=0; i<=idx-1; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println( );
        }
        void pop(){
            if(idx==0) {
                System.out.println("Stack is empty.");
                return;
            }
            else{
                int top = arr[idx-1];
                arr[idx-1] = 0;
                idx--;
                System.out.println(top);
            }
        }
        void size(){
            System.out.println(idx);
        }
        boolean isEmpty(){
            if(idx == 0){
                return true;
            }

            return false;
        }
        boolean isful(){
            if(idx ==arr.length){
                return true;
            }
            return false;
        }
    
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        System.out.println(st.isful());
        System.out.println(st.peek());
        st.pop();
        st.display();
        System.out.println(st.isEmpty());
        st.size();
        st.push(9);
        st.display();
    }
}
