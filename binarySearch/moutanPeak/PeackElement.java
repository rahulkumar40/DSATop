// peak index in a ountain Array

public class PeackElement {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 40, 50, 30, 10};

        int n = arr.length; 
        int lo = 1, hi = n-2;

        while (lo<=hi) {
            int mid = lo + (hi -lo)/2;

            if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid +1]){
                System.out.println("peak Element : " + mid);
                break;
            }

        }
    }
}
