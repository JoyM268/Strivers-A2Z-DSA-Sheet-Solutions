/*
    Longest Subarray with sum K[Positives]
    You are given an array 'a' of size 'n' and an integer 'k'.
    Find the length of the longest subarray of 'a' whose sum is equal to 'k'.
    Note: Array only contains positives.
    
    Link: https://www.naukri.com/code360/problems/longest-subarray-with-sum-k_6682399

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

class Solution {
    public static int longestSubarrayWithSumK(int[] a, long k) {
        int i = 0, j = 0;
        long sum = 0;
        int maxLen = 0;
        
        while (j < a.length) {
            sum += a[j];
            
            while (i <= j && sum > k) {
                sum -= a[i++];
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, j - i + 1);
            }
            j++;
        }
        
        return maxLen;
    }
}

/*
    Alternative Approach 1(Using HashMap + Prefix Sum):
    Time Complexity: O(n)
    Space Complexity: O(n)

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
*/

/*
    Alternative Approach 2(Brute Force Approach):
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