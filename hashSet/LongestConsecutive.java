import java.util.HashSet;
import java.util.Set;

/*
128. Longest Consecutive Sequence
Medium
Topics
premium lock icon
Companies
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
Example 3:

Input: nums = [1,0,1,2]
Output: 3
 
 */
public class LongestConsecutive {
    public static void main(String[] args) {
        int nums[] = { 100, 4, 200, 3, 2, 1 };
        Set<Integer> st = new HashSet<>();
        int max = 0;

        for (int i : nums)
            st.add(i);

        for (int num : nums) {
            int startingPoint = num - 1;
            int count = 0;
            if (!st.contains(startingPoint)) {
                int currentNum = num;
                while (st.contains(currentNum + 1)) {
                    count++;
                    currentNum++;
                }
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }
}
