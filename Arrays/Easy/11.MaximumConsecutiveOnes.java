/*
    Maximum Consecutive Ones
    Given a binary array nums, return the maximum number of consecutive 1's in the array.

    Link: https://leetcode.com/problems/max-consecutive-ones/

    Time Complexity: O(n)
    Auxiliary Space: O(1)
*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                max = Math.max(max, count);
            }else{
                count = 0;
            }
        }
        return max;
    }
}