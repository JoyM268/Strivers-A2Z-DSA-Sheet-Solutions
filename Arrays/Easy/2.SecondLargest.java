/*
    Second Largest
    Given an array of positive integers arr[], return the second largest element from the array.
    If the second largest element doesn't exist then return -1.
    Note: The second largest element should not be equal to the largest element.

    Link: https://www.geeksforgeeks.org/problems/second-largest3735/1

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

/*
    Hint: If a number is greater than first, update second to first and set first to the new number. 
    If a number is smaller than first but greater than second, update second to that number.
*/


class Solution {
    public int getSecondLargest(int[] arr) {
        int first = -1, second = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > first){
                second = first;
                first = arr[i];
            }else if(arr[i] > second && arr[i] < first){
                second = arr[i];
            }
        }
        
        return second;
    }
}