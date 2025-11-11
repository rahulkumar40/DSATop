import java.util.HashMap;

public class TwoSum {
    static int[] twoSum(int arr[], int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int sumReq = target - arr[i];
            if (mp.containsKey(sumReq)) {
                return new int[] { i, mp.get(sumReq) };
            }
            mp.put(arr[i], i);
        }
        return new int [] {-1, -1};
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 8, 5, 10 };
        int target = 14;
        int ans[] = twoSum(arr, target);
        System.out.println(ans[0] + " " + ans[1]);

    }
}
