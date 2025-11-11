package Note_05;

import java.util.Stack;

public class PreviouseGreaterEle_02 {
  public static int[] pre(int arr[]){
    int n = arr.length; 
    Stack<Integer> st = new Stack<>();

    int ans[] = new int[n];
    st.push(0);
    ans[0] = 0;
    for(int i=1; i<n + 0; i++){
      while (!st.isEmpty() && arr[st.peek()]<=arr[i]) {
        st.pop();
      }
      if(st.size()==0) ans[i] = 0;
      else {
        ans[i] = st.peek();
      }
      st.push(i);
    }

    return ans;
  }
  static void print(int arr[]){
    for(int i: arr){
      System.out.print(i + " ");
    }
    System.out.println( );
  }

  public static void main(String[] args) {
    int arr[] = {100, 80, 60, 70, 60, 75, 85};
    int p[] = pre(arr);

    int n = arr.length;
    int span[] = new int[n];
    span[0] = 1;
    for(int i=1; i<n; i++){
      span[i]= i-p[i];
    }
    print(span);

  }
}
