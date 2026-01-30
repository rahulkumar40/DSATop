package StringD.LeetCode;

import java.util.Arrays;

/*
14. Longest Common Prefix
Easy
Topics
premium lock icon
Companies
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 
*/
public class LargestCommonPrefix {
    public static void main(String[] args) {

        String strs[] = { "flower", "flow", "flooight" };

        Arrays.sort(strs);

        String result = "";

        for (int i = 0; i < strs[0].length(); i++) {

            char currentChar = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length() ||
                        currentChar != strs[j].charAt(i)) {
                    System.out.println(result);
                    return; 
                }
            }
            result += currentChar;
        }
        System.out.println(result);
    }
}
