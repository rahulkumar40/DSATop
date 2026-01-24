import java.util.HashMap;

public class CheckPlindrom {
     public static boolean isAlphabeticPalindrome(String code) {
        
    // Write your code here
        code = code.toLowerCase();
        int j = code.length()-1,i=0;
        while(i<j){
            char front=code.charAt(i);
            char rear = code.charAt(j);
            if(front<'a' || front>'z'){
                i++;
                continue;
            };
            if(rear<'a' || rear>'z'){
                j--;
                continue;
            }
            else if(front!=rear) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "498493!!!";
        System.out.println(isAlphabeticPalindrome(s));
    }
}
