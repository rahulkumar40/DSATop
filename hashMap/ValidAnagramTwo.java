import java.util.HashMap;

public class ValidAnagramTwo {
    static boolean checkAnagram(String s, String k) {
        int sLen = s.length();
        int kLen = k.length();
        if (sLen != kLen)
            return false;
        HashMap<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < sLen; i++) {
            char ch = s.charAt(i);
            if (!mp.containsKey(ch))
                mp.put(ch, 1);
            else
                mp.put(ch, mp.get(ch) + 1);
        }

        for (int i = 0; i < kLen; i++) {
            char kChar = k.charAt(i);
            if (!mp.containsKey(kChar))
                return false;
            else
                mp.put(kChar, mp.get(kChar) - 1);
        }

        for (Integer i : mp.values()) {
            if (i != 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        boolean k = checkAnagram("keen", "knoe");
        System.out.println(k);
 
    }
}
