/* 
    Longest Consecutive Subsequence
    Given an array arr of non-negative integers. 
    Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.

    Link: https://www.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1

    Time Complexity: O(n)
    Space Complexity: O(n)
*/

/*
    Hint: Use a HashSet to store array elements for quick lookup. 
    Start counting sequences only from numbers that don't have a predecessor (ele - 1 missing). 
    For each valid start, count consecutive elements and track the maximum sequence length.
*/

class Solution {
    public int findLongestConseqSubseq(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            set.add(ele);
        }
        
        int max = 0;
        for(int ele : arr){
            if(!set.contains(ele - 1)){
                int count = 0;
                int num = ele;
                while(set.contains(num++)){
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        
        return max;
    }
}

/*
    Alternative Approach(Using Sorting):
    Time Complexity: O(nlog(n))
    Space Complexity: O(1)

    class Solution {
        public int findLongestConseqSubseq(int[] arr) {
            Arrays.sort(arr);
            int count = 1;
            int max = 1;
            for(int i = 1; i < arr.length; i++){
                if(arr[i] - arr[i - 1] == 1){
                    count++;
                    max = Math.max(max, count);
                }else if(arr[i] - arr[i - 1] != 0){
                    count = 1;
                }
            }
            return max;
        }
    }
*/