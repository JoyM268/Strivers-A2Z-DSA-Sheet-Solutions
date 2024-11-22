/*
    Longest Subarray with sum K [Positives + Negatives]
    Given an array arr[] containing integers and an integer k, your task is to find the length of the longest subarray where the sum of its elements is equal to the given value k. 
    It is guaranteed that a valid subarray exists.

    Link: https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

    Time Complexity: O(n)
    Auxiliary Space: O(n)

*/

/*
    Hint: Use a HashMap to store prefix sums.
*/

class Solution {
    public int lenOfLongestSubarr(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            
            if(sum == k){
                maxLen = Math.max(maxLen, i + 1);
            }
            
            int rem = sum - k;
            if(map.containsKey(rem)){
                maxLen = Math.max(maxLen, i - map.get(rem));
            }
            
            map.putIfAbsent(sum, i);
        }
        
        return maxLen;
    }
}

/*
    Alternative Approach(Brute Force Approach):
    Time Complexity: O(n^2)
    Space Complexity: O(1)

    class Solution {
        public int lenOfLongestSubarr(int[] arr, int k) {
            int maxLen = 0;
            for(int i = 0; i < arr.length; i++){
                int sum = 0;
                for(int j = i; j < arr.length; j++){
                    sum += arr[j];
                    if(sum == k){
                        maxLen = Math.max(maxLen, j - i + 1);
                    }
                }
            }
            
            return maxLen;
        }
    }
*/