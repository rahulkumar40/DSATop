package hashSet;
import java.util.*;
public class IntersectionOfMultipleArrays {

     public static List<Integer> intersection(int[][] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        // add first array
        for (int num : nums[0]) {
            set.add(num);
        }


        for (int i = 1; i < nums.length; i++) {
            HashSet<Integer> current = new HashSet<>();
            for (int num : nums[i]) {
                if (set.contains(num)) {
                    current.add(num);
                }
            }
            set = current;
        }

        List<Integer> ans = new ArrayList<>(set);
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{3,4,5,2},{4,3,4,5}};
        System.out.println(intersection(arr));
    }
}