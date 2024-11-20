/*
    Union of Two Sorted Arrays with Duplicate Elements.
    Given two sorted arrays a[] and b[], where each array may contain duplicate elements, the task is to return the elements in the union of the two arrays in sorted order.
    Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.

    Link: https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1

    Time Complexity: O(n + m)
    Auxiliary Space: O(n + m)
*/

/*
    Hint: To find the union of two arrays, traverse both arrays with two pointers. 
    Skip duplicates within each array, compare the elements at the pointers, and add the smaller element to the result. 
    If both elements are equal, add one of them. 
    After processing both arrays, add any remaining unique elements from either array to the result.
*/

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer>ans = new ArrayList<>();
        int i = 0, j = 0;
        while(i < a.length && j < b.length){
            if(i > 0 && a[i - 1] == a[i]){
                i++;
                continue;
            }
            
            if(j > 0 && b[j - 1] == b[j]){
                j++;
                continue;
            }
            
            if(a[i] == b[j]){
                ans.add(a[i++]);
                j++;
            }else if(a[i] < b[j]){
                ans.add(a[i++]);
            }else{
                ans.add(b[j++]);
            }
        }
        
        while(i < a.length){
            if(i > 0 && a[i - 1] == a[i]){
                i++;
                continue;
            }
            ans.add(a[i++]);
        }
        
        while(j < b.length){
            if(j > 0 && b[j - 1] == b[j]){
                j++;
                continue;
            }
            ans.add(b[j++]);
        }
        
        return ans;
    }
}
