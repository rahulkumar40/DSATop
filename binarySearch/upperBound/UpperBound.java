package upperBound;

public class UpperBound {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 30, 40, 50, 60, 70};

        int n = arr.length;
        int lo = 0; 
        int hi = n-1; 

        int ub = n;
        int target = 30;
        while (lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if(arr[mid] > target){
                ub = Math.min(ub, mid);
                hi = mid -1;
            }
            else lo = mid +1;
        }
        System.out.println(ub);
    }
}
