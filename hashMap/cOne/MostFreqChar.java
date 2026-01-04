
import java.util.HashMap;

public class MostFreqChar {

    static void mostFreq(String str) {
        HashMap<Character, Integer> hs = new HashMap<>();

        int maxFre = 0;
        char ansCh = ' ';
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hs.containsKey(ch)) {
                hs.put(ch, hs.get(ch) + 1);
            } else
                hs.put(ch, 1);

            if (hs.get(ch) > maxFre) {
                maxFre = hs.get(ch);
                ansCh = ch;
            }
        }
        System.out.println(hs);
        System.out.println(maxFre + " Real Answer : " + ansCh);

        // return 0;
    }

    public static void main(String[] args) {
        String str = "abaaaacccccccbbbraac";
        int[] freq = new int[26];
        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }
        int maxFreqChar = 0;
        int maxEle = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreqChar) {
                maxFreqChar = freq[i];
                maxEle = i;
            }
        }
        System.out.println(maxFreqChar + " Origin Elem " + maxEle);
        char ch = (char) (97 + maxEle);
        System.out.println(ch);
        mostFreq(str);
    }
}
