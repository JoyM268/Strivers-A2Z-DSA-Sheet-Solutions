/*
    Rotate Array By D
    Given an unsorted array arr[]. 
    Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. 
    Do the mentioned change in the array in place.
    Note: Consider the array as circular.

    Link: https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

/*
    Hint: To rotate an array, first reverse the first part (from index 0 to d-1), then reverse the second part (from index d to the end). 
    Finally, reverse the entire array to get the rotated result. 
*/

class Solution {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static void reverse(int[] arr, int i, int j){
        while(i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    
    static void rotateArr(int arr[], int d) {
        d %= arr.length;
        reverse(arr, 0, d - 1);
        reverse(arr, d, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }
}