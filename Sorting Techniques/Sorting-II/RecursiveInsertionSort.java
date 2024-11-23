/*
    Recursive Insertion Sort Algorithm
    Given an array of N integers, write a program to implement the Recursive Insertion Sort algorithm.

    Link: https://www.geeksforgeeks.org/problems/insertion-sort/1

    Time Complexity: O(N^2)
    Space Complexity: O(N)
*/

class Solution {
    public void sort(int[] arr, int i, int n){
        if(i == n) return;
        int j = i - 1, key = arr[i];
        while(j >= 0 && arr[j] > key){
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
        sort(arr, i + 1, n);
    }
    
    public void insertionSort(int arr[]) {
        sort(arr, 1, arr.length);
    }
}