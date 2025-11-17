package twoPointer;

// reverse a string
// check  if (original.equals(reversed)) {
/*           System.out.println("Palindrome");
      } else {
          System.out.println("Not Palindrome");
      } */

public class CheckPalindrome {
    static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            char leftChar = str.charAt(left);
            char rightChar = str.charAt(right);
            if (leftChar != rightChar)
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "jahaj";
        String s = "123434";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(s));
    }
}
