/*
    Merge Without Extra Space
    Given two sorted arrays a[] and b[] in non-decreasing order. 
    Merge them in sorted order without using any extra space. 
    Modify a so that it contains the first n elements and modify b so that it contains the last m elements.

    Link: https://www.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1

    Time Complexity: O(n*log(m))
    Auxiliary Space: O(1)
*/

class Solution {
    public void swap(int[] a, int[] b, int i, int j){
        int temp = a[i];
        a[i] = b[j];
        b[j] = temp;
        
    }
    
    public void mergeArrays(int a[], int b[]) { 
        int i = a.length - 1, j = 0;
        
        while(i >= 0 && j < b.length && a[i] >= b[j]){
            swap(a, b, i, j);
            i--;
            j++;
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
    }
}