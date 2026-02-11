import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindTheDifferenceOfTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>(Arrays.asList(
    new ArrayList<>(), 
    new ArrayList<>()
));

        HashSet<Integer> one = new HashSet<>();
        HashSet<Integer> two = new HashSet<>();
        for(int ele:nums1)one.add(ele);
        for(int ele:nums2)two.add(ele);
        for(int ele:one){
            if(!two.contains(ele)){
                ans.get(0).add(ele);
            }
        }
        for(int ele:two){
            if(!one.contains(ele)){
                ans.get(1).add(ele);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums1[]={1,2,3};
        int nums2[]={2,4,5};
        List<List<Integer>> ans = findDifference(nums1, nums2);
        System.out.println(ans);
    }
}
