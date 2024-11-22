/*
    Count Subarray sum Equals K
    Given an unsorted array of integers, find the number of continuous subarrays having sum exactly equal to a given number k.

    Link: https://www.geeksforgeeks.org/problems/subarrays-with-sum-k/1

    Time Complexity: O(n)
    Auxiliary Space: O(n)
*/

/*
    Hint: Use a running sum and a hashmap to track prefix sums. 
    For each element, check if sum - k exists in the hashmap to count subarrays ending at the current index. 
    Increment the hashmap with the current sum as you iterate.
*/


class Solution {
    public int findSubArraySum(int k, int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            
            if(sum == k){
                count++;
            }
            
            int rem = sum - k;
            if(map.containsKey(rem)){
                count += map.get(rem);
            }
            
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}

/*
    Alternative Approach(Brute Force Approach):
    Time Complexity: O(n^2)
    Space Complexity: O(1)

    class Solution {
        public int findSubArraySum(int k, int arr[]) {
            int count = 0;
            for(int i = 0; i < arr.length; i++){
                int sum = 0;
                for(int j = i; j < arr.length; j++){
                    sum += arr[j];
                    if(sum == k){
                        count++;
                    }
                }
            }
            return count;
        }
    }
*/