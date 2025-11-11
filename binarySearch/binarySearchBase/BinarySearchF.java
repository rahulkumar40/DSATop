package binarySearchBase;

public class BinarySearchF {
    public static void main(String[] args) {
        int arr[] = {10, 15, 21, 43, 81, 105, 180, 500, 614};

        int n = arr.length; 
        int target = 430;
        int low = 0; 
        int high = n-1; 
        boolean flag = false;
        while (low<=high) {
            int mid = (low + high)/ 2;
            if(arr[mid] < target) low = mid + 1;
            else if(arr[mid] > target) high = mid -1; 
            else if (arr[mid] == target){
                flag = true;
                break; 
            }
        }

        if(flag == false) System.out.println("target is not present : ");
        else System.out.println("target is present at ");
    }
}
