/*
    Insertion Sort
    The task is to complete the insertsort() function which is used to implement Insertion Sort.

    Link: https://www.geeksforgeeks.org/problems/insertion-sort/0

    Time Complexity: O(n^2)
    Auxiliary Space: O(1)
*/

/*
    Hint: Start with the second element, compare it backward with sorted elements, and shift larger ones forward. 
    Insert the current element into its correct position and repeat for all elements.
*/

class Solution {
    public void insertionSort(int arr[]) {
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}