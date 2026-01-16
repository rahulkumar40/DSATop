import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindTheDiffLeetCo {
    static char ans (String s,String t){
        HashMap<Character,Integer> st = new HashMap<>();
        
        for(int i=0; i<t.length(); i++){
            st.put(t.charAt(i),st.getOrDefault(t.charAt(i),0)+1);
        }

        System.out.println(st);
        for(int i=0; i<s.length(); i++){
            st.put(s.charAt(i),st.getOrDefault(s.charAt(i),0)-1);
        }
        System.out.println(st);
        char ans = ' ';
        System.out.println( );
        for(char c : st.keySet()){
            if(st.get(c)>=1) {
                return c;
            }
        }
        System.out.println( );
        return ans;
    }
    public static void main(String[] args) {
        String  s = "abcd", t = "abcde";
        Set<Character> st = new HashSet<>();
        System.out.println(ans(s, t));
        // for(int i=0; i<s.length();i++){
        //     st.add(s.charAt(i));
        // }
        // System.out.println(st);

        // for(int i=0; i<t.length(); i++){
        //     if(!st.contains(t.charAt(i))){
        //         System.out.println(t.charAt(i));
        //         return;
        //     }
        // }
        // System.out.println(" KJLKJ ");
    }
}
