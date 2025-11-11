package Note_04;

import java.util.Stack;

public class BalancedSizeValid_02 {
  public static void valid(String s){
    Stack<Character> st = new Stack<>();
    for(int i=0; i<s.length(); i++){
      char ch = s.charAt(i);
      if(ch=='(') st.push(ch);
      else{
        if(!st.isEmpty() && st.peek()=='(' && ch==')'){
          // if ( == ) then pop otherwise  do else part
          st.pop();
        }
        else{
          // jo balanced nhi hhai use dal do or baad me use gin lo .....
          st.push(ch);
        }
      }
      System.out.println(st);
    }
    System.out.println(st.size());
    System.out.println(st);
  }
  public static void main(String[] args) {
    String s = "((()))(()))(()))(())))";
    valid(s);

  }
}
