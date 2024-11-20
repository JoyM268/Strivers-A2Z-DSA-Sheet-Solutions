/*
    Move All Zeroes to End
    Given an array arr[]. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements. 
    Do the mentioned change in the array in place.

    Link: https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

class Solution {
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    void pushZerosToEnd(int[] arr) {
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                swap(arr, i, j++);
            }
        }
    }
}
