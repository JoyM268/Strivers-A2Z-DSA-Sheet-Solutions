/*
    Largest subarray with 0 sum
    Given an array arr containing both positive and negative integers, the task is to compute the length of the largest subarray that has a sum of 0.

    Link: https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1

    Time Complexity: O(n)
    Auxiliary Space: O(n)
*/

/*
    Hint: Use a hashmap to track prefix sums. If the sum becomes zero or repeats, update the max length. 
    Store the first occurrence of each sum to calculate the subarray length efficiently.
*/

class Solution {
    int maxLen(int arr[]) {
        int max = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            
            if(sum == 0){
                max = Math.max(max, i + 1);
            }
            
            if(map.containsKey(sum)){
                max = Math.max(max, i - map.get(sum));
            }
            
            map.putIfAbsent(sum, i);
        }
        
        return max;
    }
}