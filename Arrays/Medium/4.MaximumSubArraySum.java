/*
    Maximum SubArray Sum - Kadane's Algorithm
    Given an integer array arr[]. You need to find and return the maximum sum possible from all the subarrays.

    Link: https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

/*
    Hint: Kadane's Algorithm
    Update the max sum at every step by choosing between adding the current element to the running sum or starting fresh with the current element if running sum is negative.
*/

class Solution {
    int maxSubarraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0; i < arr.length; i++){
            if(currentSum < 0){
                currentSum = 0;
            }
            currentSum += arr[i];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
