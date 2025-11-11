package Note_01;
import java.util.*;
public class DisplayStack_03 {
  public static void byExtraStack(Stack<Integer> st){
    Stack<Integer> temp = new Stack<>();
    while (st.size()!=0) {
      temp.push(st.pop());
    }
    System.out.println("By Extra Stack..");
    while (temp.size()!=0) {
      int top = temp.pop();
      System.out.print(top + " ");
      st.push(top);
    }
    System.out.println( );
  }

  public static void byArray(Stack<Integer> st){
    int n = st.size();
    int arr[] = new int[n];
    for(int i=n-1; i>=0; i--){
      arr[i] = st.pop();
    }
    System.out.println("By Array ....");
    for(int i=0; i<n; i++){
      System.out.print(arr[i]+ " ");
      st.push(arr[i]);
    }
  }

  public static void byRecursion(Stack<Integer> st){
    if(st.size()==0) return;
    int top = st.pop();
    byRecursion(st);
    System.out.print(top + " ");
  }
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);
    byExtraStack(st);
    System.out.println(st);
    byArray(st);
    System.out.println( );
    System.out.println("By Recursion...");
    byRecursion(st);
  }
}
