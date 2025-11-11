package Note_01;

import java.util.Stack;

public class Stack_Basic_STL_01 {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();

    // push operation
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);

    System.out.println(st);   //[10, 20, 30, 40]

    // pop
    st.pop(); ////[10, 20, 30] 
    st.pop();  //[10, 20]

    // peek 
    int top = st.peek();      // stack --> [10, 20]
    System.out.println(top);  // 20

    // size operation
    int size = st.size();      // stack --> [10, 20]
    System.out.println(size); // 2

    // isEmpty() operation
    boolean is = st.isEmpty();  // stack --> [10, 20]
    System.out.println(is);   // false ---> because stack has value.

    // isfull operation
    // boolean full = st.isEmpty();  // stack --> [10, 20]
    System.out.println(st.search(10));  //   
    

  }
}
