public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x); // Convert to String
        int n = s.length(); // Store the String length to int n

        for (int i=0; i<n/2; i++) {
            // We check whether the elements at the same distance from
            // beginning and from ending are same, if not we return false
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }

        // if no flaws are found we return true
        return true;
    }
    public static void main(String[] args) {
        int num = 484;
        System.out.println(isPalindrome(num));
    }
}
