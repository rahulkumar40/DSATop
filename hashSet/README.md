# 349. Intersection of Two Arrays
> Easy
> Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

* Example 1:

* Input: nums1 = [1,2,2,1], nums2 = [2,2]
* Output: [2]
---
* Example 2:

* Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
* Output: [9,4]
* Explanation: [4,9] is also accepted.
 

> Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000

--- 
# 2215. Find the Difference of Two Arrays

Easy
> Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

> answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
---
> answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
---
> Note that the integers in the lists may be returned in any order.

 

* Example 1:
<br>
*Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]<br>
*Explanation:<br>
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums1. Therefore, answer[1] = [4,6].
---
* Example 2:
<br>
Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
Output: [[3],[]]
Explanation:
For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
Every integer in nums2 is present in nums1. Therefore, answer[1] = [].
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
-1000 <= nums1[i], nums2[i] <= 1000

--- 
# 2248. Intersection of Multiple Arrays
Easy
>Given a 2D integer array nums where nums[i] is a non-empty array of distinct positive integers, return the list of integers that are present in each array of nums sorted in ascending order.
 

* Example 1:

* Input: nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]
* Output: [3,4]
> Explanation: <br>
The only integers present in each of nums[0] = [3,1,2,4,5], nums[1] = [1,2,3,4], and nums[2] = [3,4,5,6] are 3 and 4, so we return [3,4].
---
* Example 2:

* Input: nums = [[1,2,3],[4,5,6]]
* Output: []
* Explanation: <br>
There does not exist any integer present both in nums[0] and nums[1], so we return an empty list [].
 

* Constraints:

1 <= nums.length <= 1000
1 <= sum(nums[i].length) <= 1000
1 <= nums[i][j] <= 1000
All the values of nums[i] are unique.