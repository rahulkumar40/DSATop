package basicMath.Basic;

public class PrimeNumber {
    static boolean countTotalPrimeNum(int n){
        int count =0;
        for(int i=1; i<=n; i++){
            if(n%i==0) count++;
            if(count>2) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 78;
        int count =0;
        for(int i=2; i<=n; i++){
            if(countTotalPrimeNum(i)) count ++;
        }
        System.out.println(count);
    }
}
