package Note_04;

import java.util.Stack;

/**
 * LeetCode_20
 */
public class LeetCode_20 {
  static void valid(String s){
    Stack<Character> st = new Stack<>();
    for(int i=0; i<s.length(); i++){
      char ch = s.charAt(i);
      if(ch=='(' || ch=='{' || ch=='['){
        st.push(ch);
      }
      else{
        if(!st.isEmpty() && st.peek()=='(' && ch==')') st.pop();
        else if(!st.isEmpty() &&st.peek()=='{' && ch=='}') st.pop();
        else if(!st.isEmpty() &&st.peek()=='[' && ch==']') st.pop();

        else st.push(ch); 
        // jo extra ho rha ha uske liye 

      }

        System.out.println(st);
      }
    System.out.println(st.size());
    if(st.size()>0) System.out.println("False");
    else System.out.println("True");
  }

  public static void main(String[] args) {
    String s = "(){}[)(}{}{}{}{[(())]";
    valid(s);
  }
}