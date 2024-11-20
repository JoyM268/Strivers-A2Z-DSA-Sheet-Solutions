/*
    Missing in Array.
    You are given an array arr of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). 
    This array represents a permutation of the integers from 1 to n with one element missing. 
    Your task is to identify and return the missing element.

    Link: https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1

    Time Complexity: O(n)
    Auxiliary Space: O(1)
*/

/*
    Hint:
    0 ^ x = x
    x ^ x = 0
*/

class Solution {
    int missingNumber(int arr[]) {
        int xor = 0;
        for(int i = 0; i < arr.length; i++){
            xor ^= arr[i] ^ (i + 1);
        }
        
        return xor ^ arr.length + 1;
    }
}