/*
    Given an array arr. Find the majority element in the array. If no majority exists, return -1.
    A majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.

    Link: https://www.geeksforgeeks.org/problems/majority-element-1587115620/1

    Time Complexity: O(n)
    Auxilary Space: O(1)
*/

/*
    Hint: The idea is based on Moore’s Voting algorithm.  
*/

class Solution {
    static int majorityElement(int arr[]) {
        int count = 0, num = 0;
        for(int ele : arr){
            if(count == 0){
                num = ele;
                count++;
            }else if(num == ele){
                count++;
            }else{
                count--;
            }
        }
        
        count = 0;
        for(int ele : arr){
            if(ele == num){
                count++;
            }
        }
        
        return count > arr.length/2? num : -1;
    }
}

/*
    Alternative Approach(Using Hashing):
    Time Complexity: O(n)
    Space Complexity: O(n)

    class Solution {
        static int majorityElement(int arr[]) {
            HashMap<Integer, Integer> m = new HashMap<>();
            for(int ele: arr){
                m.put(ele, m.getOrDefault(ele, 0) + 1);
            }
            
            for(int key: m.keySet()){
                if(m.get(key) > arr.length/2){
                    return key;
                }
            }
            return -1;
        }
    }
*/