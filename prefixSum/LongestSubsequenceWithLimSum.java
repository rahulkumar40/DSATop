
public class LongestSubsequenceWithLimSum {
    static int index(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= target) {
                ans = mid + 1;    
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static public int[] answerQueries(int[] nums, int[] queries) {

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        for (int i = 0; i < queries.length; i++) {
            queries[i] = index(nums, queries[i]);
        }

        return queries;
    }
            // Binary search to find max index where prefixSum[index] <= target
    
    public static void main(String[] args) {
       int [] nums = {4,5,2,1};
       int [] queries = {3,10,21};
       answerQueries(nums,queries);
    }
}
