package StringD.reverseStr;

/*
⭐ Q1. Reverse the entire string
Input:  My name is amit
Output: tima si eman yM
*/
public class ReverseEntireString {
    public static void main(String[] args) {
        String str = "My name is Rahul";
        String ans = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            ans += str.charAt(i);
        }
        System.out.println(ans.trim());
    }
}
