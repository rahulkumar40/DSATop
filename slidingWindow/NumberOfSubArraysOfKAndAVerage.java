public class NumberOfSubArraysOfKAndAVerage {
    // 1st Methode -> Frutforce approach useing nested loop

    static int solution(int arr[], int k, int threshold) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < k + i; j++) {
                sum += arr[j];
            }
            if ((sum / k) >= threshold)
                count++;
        }
        return count;
    }

    static int optMethodWindow(int arr[], int k, int threshold) {
        int n = arr.length;
        int sum = 0;
        int maxSum = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int i = 0;
        if (sum / k >= threshold)
            count++;
        for (int j = k; j < n; j++) {
            sum += arr[j] - arr[i];
            i++;
            maxSum = Math.max(maxSum, sum);
            if (maxSum / k >= threshold)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 2, 5, 5, 5, 8 };
        System.out.println(solution(arr, 3, 4));
        System.out.println(optMethodWindow(arr, 3, 4));
    }
}
