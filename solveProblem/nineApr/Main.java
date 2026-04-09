package solveProblem.nineApr;

public class Main {
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.err.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        swap(4,5);
    }
}
