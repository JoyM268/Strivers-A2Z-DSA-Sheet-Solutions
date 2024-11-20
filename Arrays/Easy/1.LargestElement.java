/*
    Largest Element in Array
    Given an array arr[]. The task is to find the largest element and return it.
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