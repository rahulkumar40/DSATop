package basicMath.Basic;

public class SumOfSquaresOffirstNNum {
    static void withForLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }

    static int withRecursion(int n) {
        if (n == 1)
            return 1;
        return n * n + withRecursion(n - 1);
    }

    public static void main(String[] args) {
        int n = 8;
        withForLoop(n);
        System.out.println(withRecursion(n));
    }
}
