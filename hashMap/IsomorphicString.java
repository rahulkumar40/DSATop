import java.util.HashMap;

public class IsomorphicString {
    // given two string s and t detrmine if they are isommorphic
    // two string s and t are isomorphic if the character in s can be replaced to
    // tet t
    // input
    // s - aab
    // t - xxy --> output true like a --> x and b--> y then after replacing value
    // both are same so it is sam e

    public static boolean validIsomorphic(String s, String k) {
        HashMap<Character, Character> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character sCh = s.charAt(i);
            Character kCh = k.charAt(i);

            if (mp.containsKey(sCh)) {
                if (mp.get(sCh) != kCh)
                    return false;

            } else if (mp.containsValue(kCh)) {
                return false;
            } else
                mp.put(sCh, kCh);

        }
        return true;
    }

    public static void main(String[] args) {
        boolean k = validIsomorphic("aabb", "xxyy");
        System.out.println(k);

    }
}
