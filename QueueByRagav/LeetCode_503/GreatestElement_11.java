package LeetCode_503;

/*
 * Medium
Topics
Companies
Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.

The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.

 

Example 1:

Input: nums = [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2; 
The number 2 can't find next greater number. 
The second 1's next greater number needs to search circularly, which is also 2.
Example 2:
 */
public class GreatestElement_11 {
    public static int[] nextGreaterElements(int[] arr) {
        int max = arr[0];
        int n = arr.length;
        // int n = size;
        int ans[] = new int[n];
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        ans[n-1] = max;
        for(int i=0; i<n; i++){
            for(int j=i; j<n-1; j++){
                if(arr[i]<arr[j]){
                    ans[i] = arr[j];
                    break;
                }
            }
        }
        return ans;
    }
  public static void main(String[] args) {
    int nums[] = {1,2,1};
    int a[]= nextGreaterElements(nums);
    for(int i:a){
      System.out.print(i + " ");
    }
    int arr[] = {1,2,3,4,3};
  }
}
