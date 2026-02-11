import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> one = new HashSet<>();
        HashSet<Integer> two = new HashSet<>();
        for (int ele1 : nums1)
            one.add(ele1);
        for (int ele2 : nums2) {
            if (one.contains(ele2) && !two.contains(ele2)) {
                two.add(ele2);
            }
        }
        int ans[] = new int[two.size()];
        int i = 0;
        for (int ele : two) {
            ans[i++] = ele;
        }
        return ans;

    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 2, 1 };
        int nums2[] = { 2, 2 };
        int ans[] = intersection(nums1, nums2);
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}
