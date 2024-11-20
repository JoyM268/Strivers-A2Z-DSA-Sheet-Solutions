/*
    Single Number
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    You must implement a solution with a linear runtime complexity and use only constant extra space.

    Link: https://leetcode.com/problems/single-number/

    Time Complexity: O(n)
    Auxiliary Space: O(1)
*/

/*
    Hint:
    0 ^ x = x
    x ^ x = 0
*/

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int ele: nums){
            ans ^= ele;
        }
        return ans;
    }
}