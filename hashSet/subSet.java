import java.util.*;

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
