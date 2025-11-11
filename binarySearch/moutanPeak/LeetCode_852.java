/**An array arr is a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * 
 * LeetCode_852
 */
public class LeetCode_852 {

    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 40, 50, 30, 10};
        
        int n = arr.length; 
        int lo = 0, hi = n-1;

        while (lo<=hi) {
            int mid = lo + (hi - lo)/2;
            if(arr[mid] > arr[mid -1] && arr[mid] < arr[mid +1]){
                System.out.println("Peak Eleemt : "+ mid);
                break;
            }
            else if(arr[mid] > arr[mid -1] && arr[mid] < arr[mid +1]){
                lo = mid + 1;
            }
            else if(arr[mid] < arr[mid -1] &&arr[mid] > arr[mid +1]){
                hi = mid -1;
            }
        }
    }
}