package prefixSum;

public class RunningSum {
    static int[] runningSum(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }

    static void displayArray(int arr[]) {
        for (int ele : arr)
            System.out.print(ele + " ");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 7, 9 };
        displayArray(arr);

        int ans[] = runningSum(arr);
        // System.out.println("Ans : "+ans);
        System.out.println();
        displayArray(ans);
    }
}
