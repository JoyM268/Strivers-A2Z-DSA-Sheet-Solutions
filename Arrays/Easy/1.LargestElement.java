/*
    Largest Element in Array
    Given an array arr[]. The task is to find the largest element and return it.

    Link: https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0

    Time Complexity: O(n)
    Auxilary Space: O(1)
*/

class Solution {
    public static int largest(int[] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}

/*
    Alternative Approach(Using Sorting):
    Time Complexity: O(nlog(n))
    Space Complexity: O(1)

    class Solution {
        public static int largest(int[] arr) {
            Arrays.sort(arr);
            return arr[arr.length - 1];
        }
    }
*/