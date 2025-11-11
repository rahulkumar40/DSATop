package TrapingRainWater;

import java.util.Stack;

public class leftGreater {
  public static void main(String[] args) {
    int arr[] = {3, 1, 2, 4, 0, 1, 3, 2};
    int n = arr.length; 
    Stack<Integer> st = new Stack<>();
    int left[] = new int[n];
    int right[] = new int[n];

    st.push(arr[0]);
    for(int i=0; i<n; i++){
      if(st.peek()>=arr[i]) left[i] = st.peek();
      else{
        st.push(arr[i]);
        left[i] = arr[i];
      }
    }

    while (st.size()!=0) st.pop();
    st.push(arr[n-1]);
    for(int i=n-1; i>=0; i--){
      if(st.peek()>=arr[i]) right[i] = st.peek();
      else{
        st.push(arr[i]);
        right[i] = arr[i];
      }
      System.out.println(st);
    }
    int minValue = 0;
    for(int i=0; i<n; i++){
      minValue += Math.min(left[i], right[i]) - arr[i];

    }
    System.out.println(minValue);
}
}
