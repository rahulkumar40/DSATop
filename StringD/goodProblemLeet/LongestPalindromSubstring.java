import java.util.HashMap;

public class LongestPalindromSubstring {
    static boolean isPalindrome(String s, int i, int j) {
        // int i=0, j=s.length()-1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static int longestPalindrome(String s) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = s.length();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int len = 0;
            int j = i + 1;
            // String subStr = s.substring(i,);
            while (j < n) {
                if (isPalindrome(s, i, j) && max < j - i + 1) {
                    // len = j - i + 1;
                    max = j - i + 1;
                    // max = Math.max(max, len);
                    mp.put(max, i);
                }
                j++;
            }
        }
        System.out.println(mp);
        System.out.println(s.substring(mp.get(max) + 1, mp.get(max) + max + 1));
        return max;
    }

    public static String longestPalindromee(String s) {
        int n = s.length();
        int max = 1;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = i + 1;
            while (j < n) {
                if (isPalindrome(s, i, j) && max < j - i + 1) {
                    max = j - i + 1;
                    start = i;
                }
                j++;
            }

        }
        return s.substring(start, start + max);
    }

    public static void main(String[] args) {
        String s = "uiuyuyuuuuuoiuiuiuiu";
        String sk = longestPalindromee(s);
        System.out.println(longestPalindrome(s));
    }
}
