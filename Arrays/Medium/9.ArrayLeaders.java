/*
    Array Leaders
    You are given an array arr of positive integers. 
    Your task is to find all the leaders in the array.
    An element is considered a leader if it is greater than or equal to all elements to its right. 
    The rightmost element is always a leader.
        
    Link: https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1

    Time Complexity: O(n)
    Space Complexity: O(n)
*/

/*
    Hint: Start from the rightmost element of the array since it’s always a leader. 
    Traverse the array in reverse, keeping track of the maximum seen so far. 
    Add elements to the result list if they are greater than or equal to the maximum.
*/

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer>ans = new ArrayList<>();
        int max = arr[arr.length - 1];
        ans.add(max);
        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] >= max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        
        Collections.reverse(ans);
        return ans;
    }
}

/*
    Alternative Approach(Brute Force Approach):
    Time Complexity: O(n^2)
    Space Complexity: O(n)

    class Solution {
        static ArrayList<Integer> leaders(int arr[]) {
            ArrayList<Integer>ans = new ArrayList<>();
            for(int i = 0; i < arr.length; i++){
                int j;
                for(j = i + 1; j < arr.length; j++){
                    if(arr[i] < arr[j]){
                        break;
                    }
                }
                
                if(j == arr.length){
                    ans.add(arr[i]);
                }
            }
            
            return ans;
        }
    }
*/