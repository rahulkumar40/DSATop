package hashSet;

import java.util.HashSet;

public class MinimumCommonValue {
    public static int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> st = new HashSet<>();
        for (int ele : nums1)
            st.add(ele);
        for (int ele : nums2) {
            if (st.contains(ele))
                return ele;
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 3 };
        int nums2[] = { 2, 4 };
        int ans = getCommon(nums1, nums2);
        System.out.println(ans);
    }
}
