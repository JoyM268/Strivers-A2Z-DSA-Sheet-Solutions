/*
    Rearrange Array Elements by Sign
    You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
    
    You should return the array of nums such that the the array follows the given conditions:
    1. Every consecutive pair of integers have opposite signs.
    2. For all integers with the same sign, the order in which they were present in nums is preserved.
    3.The rearranged array begins with a positive integer.

    Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
    Note: nums consists of equal number of positive and negative integers.

    Link: https://leetcode.com/problems/rearrange-array-elements-by-sign/

    Time Complexity: O(n)
    Space Complexity: O(n)
*/

/*
    Hints: Positives take even spots, negatives take odd spots.
*/

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int j = 0, k = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                ans[k] = nums[i];
                k += 2;
            }else{
                ans[j] = nums[i];
                j += 2;
            }
        }
        return ans;
    }
}