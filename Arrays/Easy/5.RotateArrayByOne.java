/*
    Rotate Array by One
    Given an array arr, rotate the array by one position in clock-wise direction.
    
    Link: https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
    
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

class Solution {
    public void rotate(int[] arr) {
        int ele = arr[arr.length - 1];
        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        
        arr[0] = ele;
    }
}