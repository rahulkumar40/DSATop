package basicMath.binaryDigit;

public class DecimalToBinary {
    static String calBinary(int n){
        String binary = "";
        while(n!=0){
            binary = (n%2)+binary;
            n=n/2;
        }
        return binary;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(calBinary(n));
    }
}
