package twoPointer;

public class ContinerWithMostWater {
    public static void main(String[] args) {
        // int arr[] = { 4, 2, 0, 3, 2, 5 };
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int left = 0, right = arr.length - 1;
        int ans = 0;
        while (left < right) {
            int baseArea = right - left;
            int minEle = Math.min(arr[left], arr[right]);
            int orgAre = minEle * baseArea;
            ans = Math.max(orgAre, ans);
            if (arr[left] < arr[right])
                left++;
            else
                right--;
        }
        System.out.println(ans);

    }
}
