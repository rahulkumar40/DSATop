package LeetCodeProblem;
import java.util.*;
public class MinimumDeletionToMakeStringBalance {
    public static int minimumDeletions(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int count = 0;
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(st.isEmpty())st.push(ch);
            else if(st.peek()=='a' && ch=='a')st.push(ch);
            else if(st.peek()=='b'&& ch=='a'){st.pop();
            count++;
            }
            else if(st.peek()=='b'&&ch=='b')st.push(ch);
            else if(st.peek()=='a'&&ch=='b')st.push(ch);
        }
        System.out.println(st);
        return count;
    }
    public static void main(String[] args) {
        String str = "abb";
        System.out.println(minimumDeletions(str));
    }
}
