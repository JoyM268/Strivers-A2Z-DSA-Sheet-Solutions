/*
    Next Permutation
    Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers into the lexicographically next greater permutation. 
    If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order). 
    Note - A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.

    Link: https://www.geeksforgeeks.org/problems/next-permutation5226/1

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

/*
    Hint: Find, Swap, Reverse. 
    Find the break point, the first number (from the right) that’s smaller than its next. 
    Then, swap it with the smallest number larger than it on the right. 
    Finally, reverse the sequence after the break point to get the smallest lexicographical order for that part.
*/

class Solution {
    void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
    void reverse(int[] arr, int index1, int index2){
        int start = index1, end = index2;
        while(start < end){
            swap(arr, start++, end--);
        }
    }
    
    void nextPermutation(int[] arr) {
        int index;
        for(index = arr.length - 2; index >= 0; index--){
            if(arr[index] < arr[index + 1])
                break;
        }
        
        if(index == -1){
            reverse(arr, 0, arr.length - 1);
            return;
        }
            
        for(int i = arr.length - 1; i > index; i--){
            if(arr[i] > arr[index]){
                swap(arr, index, i);
                break;
            }   
        }
        
        reverse(arr, index + 1, arr.length - 1);        
    }
}