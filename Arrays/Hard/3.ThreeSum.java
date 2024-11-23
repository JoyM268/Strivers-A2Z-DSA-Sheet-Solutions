/*
    Three Sum
    Given an integer array arr, return all the unique triplets [arr[i], arr[j], arr[k]] such that i != j, i != k, and j != k, and arr[i] + arr[j] + arr[k] == 0.
    Note: The triplets must be returned in sorted order, the solution vector should also be sorted, and the answer must not contain any duplicate triplets. 

    Link: https://www.geeksforgeeks.org/problems/three-sum/0

    Time Complexity: O(n^2)
    Auxiliary Space: O(No. of triplets)
*/

/*
    Hint: Sort the array, then fix one number and use two pointers to find pairs that sum to zero. 
    Adjust pointers based on the sum and skip duplicates to avoid repeating triplets.
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length - 2; i++){
            int j = i + 1;
            int k = arr.length - 1;
            
            if(i != 0 && arr[i - 1] == arr[i]){
                continue;
            }
            
            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
            
                if(sum < 0){
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    ans.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k])));
                    j++;
                    k--;
                    while(j < k && arr[j] == arr[j - 1]) j++;
                    while(j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }
        
        return ans;
    }
}