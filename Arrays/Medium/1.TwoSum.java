/*
    Two Sum
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.

    Link: https://leetcode.com/problems/two-sum/

    Time Complexity: O(n)
    Auxilary Space: O(n)
*/

/*
    Hint: Use a hash table to store numbers and their indices as you iterate through the array. 
    For each number, calculate its complement (target - current number) and check if the complement already exists in the hash table. 
    If it does, you've found the solution and can immediately return the indices.
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}



