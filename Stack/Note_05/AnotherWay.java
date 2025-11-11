package Note_05;

import java.util.Stack;

public class AnotherWay {
  public static int[] pre(int arr[]){
    int n = arr.length; 
    Stack<Integer> st = new Stack<>();

    int ans[] = new int[n];
    st.push(0);
    ans[0] = -1;
    for(int i=1; i<n + 0; i++){
      
      while (!st.isEmpty() && arr[st.peek()]<=arr[i]) {
        st.pop();
      }
      if(st.size()==0) ans[i] = -1;
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
    int arr[] = {68 ,735 ,101 ,770, 525, 279 ,559 ,563 ,465 ,106, 146, 82 ,28 ,362 ,492 ,596 ,743 ,28 ,637 ,392, 205 ,703, 154 ,293 ,383 ,622 ,317, 519, 696, 648, 127 ,372 ,339, 270, 713 ,68 ,700, 236, 295, 704 ,612, 123};
    // int arr[] = {100, 80, 60, 70, 60, 75, 85};
    int p[] = pre(arr);
    print(arr);
    System.out.println();
    print(p);
    System.out.println();
    int n = arr.length;
    int span[] = new int[n];
    // span[0] = 1;
    for(int i=0; i<n; i++){
      span[i]= i-p[i];
    }
    print(span);

  }
}
