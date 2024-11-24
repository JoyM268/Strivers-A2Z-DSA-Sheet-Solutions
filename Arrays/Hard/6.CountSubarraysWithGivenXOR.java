/*
    Count Subarrays with Given XOR
    Given an array of integers ‘ARR’ and an integer ‘X’, you are supposed to find the number of subarrays of 'ARR' which have bitwise XOR of the elements equal to 'X'.

    Link: https://www.naukri.com/code360/problems/count-subarrays-with-given-xor_1115652?leftPanelTabValue=PROBLEM

    Time Complexity: O(n)
    Auxiliary Space: O(n)
*/

/*
    Hint: Use a hashmap to track the frequency of prefix XORs. 
    For each element, calculate the current XOR and check if it matches the target or if the XOR of the current XOR with the target exists in the map. 
    Add to the count accordingly and update the map with the current XOR.
*/

class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		int xor = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int ele : arr){
            xor ^= ele;

            if(xor == x){
                count++;
            }

            if(map.containsKey(xor ^ x)){
                count += map.get(xor ^ x);
            }

            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }

        return count;
	}
}