package basicMath.Basic;
/*
Program to Print Multiplication Table Using Recursion

Given an integer n, print the multiplication table of n from 1 to 10 using recursion.

📌 Concept (What interviewer expects)

Recursion is a technique where a function calls itself to solve a smaller version of the same problem until a base condition is reached.

For a multiplication table:

Multiply n with numbers from 1 to 10

Use recursion to increase the multiplier step by step
*/
public class MultiplicationTable {
    static void withForLoop(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + n * i);
        }
    }

    static void withRecursion(int n, int i) {
        if (i > 10)
            return;
        System.out.println("5 * " + i + " = " + n * i);
        withRecursion(n, i + 1);
        ;
    }

    public static void main(String[] args) {
        int n = 5;
        withForLoop(n);
        withRecursion(n, 1);
    }
}
