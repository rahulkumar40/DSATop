package lowerBound;

public class LowerBoundBase {
    // static void printA(int arr[])
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 30, 40, 50, 60, 70};

        int n = arr.length;
        int lo = 0; 
        int hi = n-1; 

        int lb = n;


        int target = 80;
        while (lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if(arr[mid] >=target){
                lb = Math.min(lb, mid);
                hi = mid -1;
            }
            else lo = mid +1;
        }
        System.out.println(lb);
    }
}
