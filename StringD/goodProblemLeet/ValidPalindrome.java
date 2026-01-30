public class ValidPalindrome {
    // leetcode -- 125
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        int n = s.length();
        for(int i=0; i<n/2; i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
}
