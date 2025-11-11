package StackAll_000;

public class ArrayImplement_04 {
    public static class St {
        int arr[] = new int[5];
        int idx = 0;
        void push(int x){
            if(isfull()){
                System.out.println("Stack is full.");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        void display(){
            for(int i:arr){
                System.out.print(i+ " ");
            }
            System.out.println( );
        }
        void size(){
            System.out.println("Size of Stack :: " + idx);
        }
        boolean isfull(){
            if(idx==arr.length){
                return true;
            }
            return false;
        }
        
    }
    public static void main(String[] args) {
        St m = new St();
        m.push(5);
        m.size();
        m.push(6);
        m.size();
        m.display();
        m.size();
    }
}
