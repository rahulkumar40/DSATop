package Note_04;

import java.util.Stack;

public class BalancedBrackets_01 {
  public static boolean show(String s){
    Stack<Character> st = new Stack<>();
    for(int i=0; i<s.length(); i++){
      char ch = s.charAt(i);
      if(ch=='(') st.push(ch);
      else {
        if(ch==')') st.pop();
        if(st.size()==0) return false;
      }
    }
    if(st.isEmpty()) return true;
    return false;
  }
  public static void main(String[] args) {
    String s = "(()))";
    boolean b =show(s);
    System.out.println(b);
  }
}
