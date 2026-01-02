package StringD;

import java.util.HashMap;

public class MostFreqChar {

    static void mostFreq(String str) {
        HashMap<Character, Integer> hs = new HashMap<>();

        int maxFre = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hs.containsKey(ch)) {
                hs.put(ch, hs.get(ch) + 1);
            } else
                hs.put(ch, 1);

            if (hs.get(ch) > maxFre) {
                maxFre = hs.get(ch);
            }
        }
        System.out.println(hs);
        System.out.println(maxFre);
        // return 0;
    }

    public static void main(String[] args) {
        String str = "abaaaabraac";
        int[] freq = new int[26];
        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }
        int maxFreqChar = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreqChar) {
                maxFreqChar = freq[i];
            }
        }
        System.out.println(maxFreqChar);
        mostFreq(str);
    }
}
