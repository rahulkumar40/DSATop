package basicMath.Basic;
/*
🎤 One-Line Interview Answer

“I used recursion with a void method by maintaining a global variable to store the sum and stopping recursion when n becomes zero.”
*/
public class SumOfNNaturalNum {
    static void withForLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    static int withRecursion(int n) {
        if (n == 1)
            return 1;
        return n + withRecursion(n - 1);
    }

    static void withMathFormula(int n) {
        int sum = (n * (n + 1)) / 2;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("for loop");
        withForLoop(n);
        System.out.println("Recursion ");
        // withRecursion(n);
        System.out.println(withRecursion(n));
        System.out.println("Math function ");
        withMathFormula(n);
    }
}
