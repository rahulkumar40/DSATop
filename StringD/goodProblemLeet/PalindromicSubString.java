public class PalindromicSubString {
    static boolean isPalindrome(String s, int i, int j) {
        // int i=0, j=s.length();
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static int countSubstrings(String s) {
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome(s, i, j))
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "aaaakd";
        System.out.println(countSubstrings(s));
    }
}
