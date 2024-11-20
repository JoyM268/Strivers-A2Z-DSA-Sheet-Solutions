/*
    Sort 0s, 1s and 2s
    Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.

    Link: https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1

    Time Complexity: O(n)
    Auxilary Space: O(1)
*/

/*
    Hint: Dutch National Flag Algorithm.
    arr[0…low-1] contains 0. [Extreme left part]
    arr[low…mid-1] contains 1.
    arr[high+1…n-1] contains 2. [Extreme right part], n = size of the array
*/

class Solution {
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, low++, mid++);
            }else if(arr[mid] == 2){
                swap(arr, mid, high--);
            }else{
                mid++;
            }
        }
    }
}

/*
    Alternative Approach:
    Time Complexity: O(2n)
    Space Complexity: O(1)

    class Solution {
        public void sort012(int[] arr) {
            int zeros = 0, ones = 0, twos = 0;
            for(int ele: arr){
                if(ele == 0){
                    zeros++;
                }else if(ele == 1){
                    ones++;
                }else{
                    twos++;
                }
            }
            
            for(int i = 0; i < zeros; i++){
                arr[i] = 0;
            }
            
            for(int i = zeros; i < zeros + ones; i++){
                arr[i] = 1;
            }
            
            for(int i = zeros + ones; i < zeros + ones + twos; i++){
                arr[i] = 2;
            }
        }
    }
*/