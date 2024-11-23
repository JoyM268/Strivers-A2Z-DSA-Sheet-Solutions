/*
    Bubble Sort
    Given an array, arr[]. Sort the array using bubble sort algorithm.

    Link: https://www.geeksforgeeks.org/problems/bubble-sort/1

    Time Complexity: O(n^2)
    Auxiliary Space: O(1)
*/

/*
    Hint: Repeatedly compare adjacent elements and swap them if they're in the wrong order. 
    Continue until no swaps are needed, moving the largest element to its correct position in each pass.
*/

class Solution {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void bubbleSort(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++){
            boolean swapped = false;
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            
            if(!swapped) return;
        }
    }
}