/*
    Recursive Bubble Sort Algorithm
    Given an array of N integers, write a program to implement the Recursive Bubble Sort algorithm.

    Link: https://www.geeksforgeeks.org/problems/bubble-sort/1

    Time Complexity: O(N^2)
    Space Complexity: O(N)
*/

class Solution {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void sort(int[] arr, int n){
        if(n == 1) return;
        
        boolean swap = false;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]){
                swap(arr, i, i + 1);
                swap = true;
            }
        }
        
        if(!swap) return;
        
        sort(arr, n - 1);
    }
    
    public static void bubbleSort(int arr[]) {
        sort(arr, arr.length);
    }
}