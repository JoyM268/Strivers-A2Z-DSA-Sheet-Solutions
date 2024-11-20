/*
    Remove Duplicates Sorted Array
    Given a sorted array arr. Return the size of the modified array which contains only distinct elements.
    Note:
    1. Don't use set or HashMap to solve the problem.
    2. You must return the modified array size only where distinct elements are present and modify the original array such that all the distinct elements come at the beginning of the original array.

    Link: https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

/*
    Hint:
    Use two pointers, i to scan the array and j to place unique elements. 
    If arr[i] is different from arr[i - 1], copy it to arr[j] and increment j. 
    This updates the array in place, with j representing the new length.
*/

class Solution {
    public int removeDuplicates(int[] arr) {
        int j = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i - 1]){
                arr[j++] = arr[i];
            }
        }
        return j;
    }
}