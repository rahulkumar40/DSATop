public class MaximumSumSubarrayOfKSize {
    // leetcode 2461 .  Maximum sum of distinct subarrays with length k 
    static int windowAns(int arr[], int k) {
        int n = arr.length;
        int maxSum = 0;
        for (int i = 0; i < n - k; i++) {
            int innerSum = 0;
            for (int j = i; j < k + i; j++) {
                innerSum += arr[i];
            }
            System.out.println(innerSum + " " + maxSum);
            maxSum = Math.max(maxSum, innerSum);
            // System.out.println(maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 1, 3, -40, 80, 3 };
        System.out.println(windowAns(arr, 3));
    }
}
