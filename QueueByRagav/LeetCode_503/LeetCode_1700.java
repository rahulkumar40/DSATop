package LeetCode_503;
import java.util.*;
public class LeetCode_1700 {
  public static void main(String[] args) {
    // int a[] = {1 , 1, 1, 0, 0,1};
    // int b[] = {1,0,0,0,1,1};
    int a[] = {1 , 1 ,0,0};
    int b[] = {0,1,0,1};
    Queue<Integer> q = new LinkedList<>();
    Queue<Integer> p = new LinkedList<>();

    
    for(int i=0; i<a.length; i++){
      q.add(a[i]);
      p.add(b[i]);

    }

    // while (q.size()!=0)
    int n=a.length;
    // for(int i=0; i<n*2; i++) 
    int r =0;
    while (!q.isEmpty() && r<q.size()) {
      if(q.peek()!=p.peek()){
        q.add(q.remove());
        r++;
      }
      else {
        // if(!q.isEmpty()) break;
        q.remove();
        p.remove();
        r=0;
      }
      System.out.println(r);
      System.out.print(q + "     " + p);
      System.out.println( );
    }
    System.out.println(q);
    }
}
