/*
    Check if array is sorted
    Given an array arr[], check whether it is sorted in non-decreasing order.
    Return true if it is sorted otherwise false.

    Link: https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] > arr[i]){
                return false;
            }
        }
        return true;
    }
}