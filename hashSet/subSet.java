import java.util.*;

/*
    Question : 
        Check if an array is subset of another array 
    
    description : 
        Given two arrays a[] and b[] of size m and n respectively, the task is to determine whether b[] is a 
        subset of a[]. Both arrays are not sorted and element are distinct 

     int arr1[] = { 11, 1, 13, 21, 3, 7 };
    int arr2[] = { 11, 3, 7, 1 };
    output -> true

     int arr1[] = { 10,5,2,23,19 };
    int arr2[] = { 19,5,3 };

*/
public class subSet {
    static boolean isSubSet(int arr1[], int arr2[]) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        System.out.println(set);
        for (int i : arr2) {
            if (!set.contains(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };
        System.out.println(isSubSet(arr1, arr2));
    }
}
