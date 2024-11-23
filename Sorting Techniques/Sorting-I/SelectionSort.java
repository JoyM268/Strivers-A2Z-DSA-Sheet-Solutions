/*
    Selection Sort
    Given an array arr, use selection sort to sort arr[] in increasing order.

    Link: https://www.geeksforgeeks.org/problems/selection-sort/1

    Time Complexity: O(n^2)
    Auxiliary Space: O(1)
*/

/*
    Hint: Repeatedly find the smallest element from the unsorted part and swap it with the first unsorted element. 
    Keep moving the boundary of the sorted part one step forward.
*/

class Solution {
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            int maxIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[maxIndex] > arr[j]){
                    maxIndex = j;
                }
            }
            
            if(maxIndex != i)
                swap(arr, i, maxIndex);
        }
    }
}