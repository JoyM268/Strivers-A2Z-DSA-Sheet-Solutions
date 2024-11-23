/*
    4 Sum - All Quadruples
    Given an array arr of integers and another number k. Find all the unique quadruples from the given array that sum up to k.
    Note: All the quadruples which you return should be internally sorted, 
    ie for any quadruple [q1, q2, q3, q4] the following should follow: q1 <= q2 <= q3 <= q4.

    Link: https://www.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1

    Time Complexity: O(n^3)
    Auxiliary Space: O(No. of quadruples)
*/

/*
    Hint: Sort the array, then fix the first two numbers using nested loops, skipping duplicates. 
    Use two pointers to find the remaining two numbers that match the target. 
    Adjust the pointers based on the sum, and skip duplicates after finding quadruplets.
*/ 

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length - 3; i++){
            if(i > 0 && arr[i] == arr[i - 1]) continue;
            
            for(int j = i + 1; j < arr.length - 2; j++){
                if(j > i + 1 && arr[j] == arr[j - 1]) continue;
                
                int k = j + 1;
                int l = arr.length - 1;
                
                while(k < l){
                    long sum = arr[i] + arr[j] + arr[k] + arr[l];
                    
                    if(sum == target){
                        ans.add(new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k], arr[l])));
                        k++;
                        l--;
                        
                        while(k < l && arr[k] == arr[k - 1]) k++;
                        while(k < l && arr[l] == arr[l + 1]) l--;
                    }else if(sum < target){
                        k++;
                    }else{
                        l--;
                    }
                }
            }
        }
        return ans;
    }
}