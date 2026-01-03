package basicMath.Basic;

public class SwapTwoNumber {
    static void withExtraVariable(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " a");
        System.out.println(b + " b");
    }

    static void withMath(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a -> " + a);
        System.out.println("b -> " + b);
    }

    public static void main(String[] args) {
        int a = 2, b = 3;
        withExtraVariable(a, b);
        withMath(4, 20);
    }
}
