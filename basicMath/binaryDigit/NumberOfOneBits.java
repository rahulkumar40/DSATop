package basicMath.binaryDigit;

public class NumberOfOneBits {
    static String  calBinary(int n){
        String ans  = "";
        while(n!=0){
            ans=(n%2)+ans;
            n=n/2;
        }
        return ans;
    }
    public static   int hammingWeight(int n) {
        String binary = calBinary(n);
        int count = 0;
        for(int i=0; i<binary.length(); i++){
            if(binary.charAt(i)=='1')count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 11;
        System.out.println(hammingWeight(n));
    }
}
