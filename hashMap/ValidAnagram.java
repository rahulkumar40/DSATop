import java.util.HashMap;
import java.util.Scanner;

public class ValidAnagram {
    static boolean findValidAnagram(String s, String k) {
        HashMap<Character, Integer> mp = new HashMap<>();
        HashMap<Character, Integer> mc = new HashMap<>();

        if (s.length() != k.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            if (!mp.containsKey(sChar)) {
                mp.put(sChar, 1);
            } else
                mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
        }
        for (int i = 0; i < k.length(); i++) {
            char ch = k.charAt(i);
            if (!mc.containsKey(ch)) {
                mc.put(ch, 1);
            } else
                mc.put(ch, mc.get(ch) + 1);
        }
        System.out.println(mp);
        System.out.println(mc);
        if (mp.equals(mc)) {
            return true;
        } else
            return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first String : ");
        String str1 = sc.nextLine();
        System.out.println("Enter 2nd String : ");
        String str2 = sc.nextLine();
        boolean tellMeIsITNOt = findValidAnagram(str1, str2);

        System.out.println("is " + str1 + " and " + str2 + " valid or Not : "
                + (tellMeIsITNOt == true ? "valid hai" : "valid nhi hai"));

    }
}