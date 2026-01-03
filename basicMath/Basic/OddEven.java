package basicMath.Basic;
/*
Check Whether a Number is Even or Odd

You are given an integer n.
Your task is to determine whether the number is even or odd.

Return true if the number is even

Return false if the number is odd

📌 Definition (What interviewer wants to hear)

A number is called even if it is divisible by 2 without any remainder.
A number is called odd if it is not divisible by 2 and leaves a remainder of 1 when divided by 2.

🔹 Input

An integer n

🔹 Output

true → if n is even

false → if n is odd
*/
public class OddEven {
    static void noraml(int n) {
        if (n % 2 == 0)
            System.out.println("Even number -> -> " + n);
        else
            System.out.println("Odd Number -> -> " + n);
    }

    static void withMath(int k) {

        int temp = k / 2;
        if (k == temp * 2)
            System.out.println("Even Number -> -> " + k);
        else
            System.out.println("Odd Number -> -> " + k);
    }

    static void withBitwiseOperator(int n) {
        if ((n & 1) == 0)
            System.out.println("Even Number -> -> " + n);
        else
            System.out.println("Odd Number -> -> " + n);
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 6;
        noraml(n);
        withMath(n);
        withBitwiseOperator(k);
    }
}
