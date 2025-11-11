package squareRoot;

public class OptimizedSolution {
    public static void main(String[] args) {
        int x = 16;
        long lo =0; 
        long hi = x;
        while (lo <=hi){
            long mid = lo+ (hi - lo)/2;
            if(mid*mid == (long) x){
                System.out.println((int)mid);
                break;
            } 
            else if(mid*mid > (long)x) hi = mid -1;
            else lo = mid +1;
        }
        System.out.println((int)hi);
    }

}
