package LeetCode_503;
import java.util.*;
public class LeetCodeQueue {
  public static void main(String[] args) {
    String s = "lovveleetkcode";
    // String s = "aabb";

    Queue<Character> q = new LinkedList<>();

        int idx = 0;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(q.size()==0){
              q.add(ch);
            }
            else if(q.peek()==ch){
              q.remove();
            }
            else{
              if(q.peek()!=ch){
                q.add(ch);
              }
              // else{
              // q.add(q.remove());
              // }
            }
            System.out.println(q);
            // q.add(ch);
        }
        System.out.println(q);
        Stack<Character> sc = new Stack<>();
        while (q.size()!=0) {
          if(sc.size()==0){
            sc.push(q.remove());
          }
          else if(q.peek()==sc.peek()){
            q.remove();
            sc.pop();
          }
          else{
            sc.push(q.remove());
          }
          System.out.println(q);
          System.out.println(sc);
        }
        System.out.println("Ji");
        System.out.println(q);
        System.out.println(sc);
        // for(int i=0; i<s.length(); i++){
        //   char ch = s.charAt(i);
        //   if(!q.isEmpty() && q.peek()==ch){
        //     q.remove();
        //   }
        //   else if(!q.isEmpty() && q.peek()!=ch){
        //     System.out.println(i);
        //     break;
        //   }
        // }

        // System.out.println(q);
  }
}
