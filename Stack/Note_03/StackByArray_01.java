package Note_03;

class SA{
  int idx = 0;
  int arr[] = new int[6];
  void push(int val){
    if(isFull()){
      System.out.println("Stack is full");
      return ;
    }
    arr[idx] = val;
    idx++;
  }
  int pop(){
    if(idx==0) return -1;
    int top = arr[idx-1];
    arr[idx-1] = 0;
    idx--;
    return top;
  }
  int size(){
    if(isEmpty()){
      System.out.println("Stack is Empty...");
      return -1;
    }
    return idx;
  }
  int peeK(){
    if(idx==0) {
      isEmpty();
      return-1;
    }
    return arr[idx-1];
  }
  void display(){
    for(int i=0; i<idx; i++){
      System.out.print(arr[i] + " ");
    }
  }
  boolean isEmpty(){
    if(arr.length==0){
      return true;
    }
    return false;
  }
  boolean isFull(){
    if(arr.length==idx){
      return true;
    }
    return false;
  }

  int capacity(){
    return arr.length;
  }
}
public class StackByArray_01{
  public static void main(String[] args) {
    SA st = new SA();
    st.push(10);
    st.push(20);
    int n = st.size();
    System.out.println(n);
    st.display();
    System.out.println( );
    st.pop();
    st.display();
    st.pop();
    st.display();
    System.out.println( );
    // System.out.println(st.pop());
    // System.out.println(st.pop());
    System.out.println(st.peeK());
  }
}
