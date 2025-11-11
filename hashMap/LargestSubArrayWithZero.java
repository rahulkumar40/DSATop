import java.util.HashMap;

public class LargestSubArrayWithZero {
    public static void main(String[] args) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        int maxLen = 0, prefSum = 0;
        mp.put(0, -1);

        int arr[] = { 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            prefSum = prefSum + arr[i];
            if (mp.containsKey(prefSum)) {
                maxLen = Math.max(maxLen, i - mp.get(prefSum));
            } else {
                mp.put(prefSum, i);
            }
        }
        System.out.println(maxLen);
    }
}
