/*
    Linear Search
    Given an array, arr of n integers, and an integer element x, find whether element x is present in the array. 
    Return the index of the first occurrence of x in the array, or -1 if it doesn't exist.

    Link: https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

class Solution {
    static int search(int arr[], int x) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}
