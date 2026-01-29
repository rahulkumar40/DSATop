public class HappyNumber {
    public static int getSqureDigit(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSqureDigit(19));
        int n = 2;
        while (n!=1 && n!=4) {
            n = getSqureDigit(n);
        }
        System.out.println(n==1);
    }
}
