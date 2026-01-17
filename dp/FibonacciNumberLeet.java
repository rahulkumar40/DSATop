package dp;

public class FibonacciNumberLeet {
    static int fibonacciNum(int n, int dp[]) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (dp[n] != 0)
            return dp[n];
        int ans = fibonacciNum(n - 1, dp) + fibonacciNum(n - 2, dp);
        dp[n] = ans;
        return ans;

        // return dp[n] = fibonacciNum(n-1,dp) + fibonacciNum(n-2,dp);
    }

    static void tabulationForm(int n) {
        int d[] = new int[n + 1];
        d[0] = 0;
        d[1] = 1;
        for (int i = 2; i <= n; i++) {
            d[i] = d[i - 1] + d[i - 2];
        }
        System.out.println(d[n]);
    }

    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1]; // index from 0 to n
        System.out.println(fibonacciNum(n, dp));
        tabulationForm(n);
    }
}
