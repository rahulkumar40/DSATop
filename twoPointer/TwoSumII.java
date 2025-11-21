package twoPointer;

/*
 * 
 */

public class TwoSumII {
    static int[] twoSum(int arr[], int target) {
        int ans[] = { 0, 0 };
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                ans[0] = left + 1;
                ans[1] = right + 1;
                return ans;
            } else if (sum > target)
                right--;
            else
                left++;
        }
        return ans;
    }

    static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int ar[] = { 2, 3, 4 };
        int a[] = { -1, 0 };
        int ans[] = twoSum(arr, 9);
        display(arr);
        display(ans);

        System.out.println("Arra ka ");
        int anss[] = twoSum(ar, 6);
        display(ar);
        display(anss);

    }
}
