package basicMath.leetCode;

public class CommonDivisorOfArrayLee {
    /*
     * 1979. Find Greatest Common Divisor of Array
     * Solved
     * Easy
     * Topics
     * premium lock icon
     * Companies
     * Hint
     * Given an integer array nums, return the greatest common divisor of the
     * smallest number and largest number in nums.
     * 
     * The greatest common divisor of two numbers is the largest positive integer
     * that evenly divides both numbers.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [2,5,6,9,10]
     * Output: 2
     * Explanation:
     * The smallest number in nums is 2.
     * The largest number in nums is 10.
     * The greatest common divisor of 2 and 10 is 2.
     * Example 2:
     * 
     * Input: nums = [7,5,6,8,3]
     * Output: 1
     * Explanation:
     * The smallest number in nums is 3.
     * The largest number in nums is 8.
     * The greatest common divisor of 3 and 8 is 1.
     * Example 3:
     * 
     * Input: nums = [3,3]
     * Output: 3
     * Explanation:
     * The smallest number in nums is 3.
     * The largest number in nums is 3.
     * The greatest common divisor of 3 and 3 is 3.
     * 
     */
    static int findGCD(int arr[]){
        int minVal=Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for(int ele:arr){
            minVal=Math.min(minVal,ele);
            maxVal=Math.max(maxVal,ele);
        }
        for(int i=minVal; i>=2; i-- ){
            if(minVal%i==0 && maxVal%i==0)return i;
        }
        return 1;
    }
    public static void main(String[] args) {
        int []arr= {2,5,6,9,10};
        int arr1[] = {6,9,10};
        int arr2[]= {6,9};

        System.out.println(findGCD(arr));
        System.out.println(findGCD(arr1));
        System.out.println(findGCD(arr2));
    }
}