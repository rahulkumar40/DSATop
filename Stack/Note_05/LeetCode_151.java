package Note_05;

import java.util.Stack;

public class LeetCode_151 {
  static void greatestElement(int a[], int b[]){
    int n = b.length; 
    Stack<Integer> st = new Stack<>();
    int ans[] = new int[n];
    st.push(b[n-1]);
    ans[n-1] = -1;
    for(int i=n-2; i>=0; i--){
      while (!st.isEmpty() && st.peek()<b[i]) {
        st.pop();
      }
      if(st.size()==0) ans[i] = -1;
      else {
        ans[i] = st.peek();
      }
      st.push(b[i]);
    }
    System.out.println(st);
    printA(ans);

    for(int i=0; i<a.length; i++){
      for(int j=0; j<n; j++){
        if(a[i]==b[j]){
          a[i] = ans[j];
          break;
        }
      }
    }
    printA(a);
  }
  static void printA(int ar[]){
    for(int i: ar){
      System.out.print(i + " ");
    }
    System.out.println( );
  }
  public static void main(String[] args) {
    int a[] = {4, 1, 2};
    int b[] = {1, 3, 4, 2};
    greatestElement(a, b);
    printA(b);
  }
}
