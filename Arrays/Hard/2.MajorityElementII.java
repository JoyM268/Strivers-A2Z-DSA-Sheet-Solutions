/*
    Majority Element II
    You are given an array of integer arr[] where each number represents a vote to a candidate. 
    Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 
    Note: The answer should be returned in an increasing format.

    Link: https://www.geeksforgeeks.org/problems/majority-vote/1

    Time Complexity: O(n)
    Auxilary Space: O(1)
*/

/*
    Hints: The idea is based on Moore’s Voting algorithm.  
    We first find two candidates.
    Then we check if any of these two candidates is actually a majority.
*/

class Solution {
    public List<Integer> findMajority(int[] nums) {
        int num1 = 0, num2 = 0, count1 = 0, count2 = 0;
        for(int ele: nums){
            if(num1 == ele){
                count1++;
            }else if(num2 == ele){
                count2++;
            }else if(count1 == 0){
                num1 = ele;
                count1++;
            }else if(count2 == 0){
                num2 = ele;
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        
        count1 = 0; 
        count2 = 0;
        for(int ele: nums){
            if(ele == num1){
                count1++;
            }else if(ele == num2){
                count2++;
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        if(count1 > nums.length/3)
            ans.add(num1);
        if(count2 > nums.length/3)
            ans.add(num2);
        
        if(ans.size() == 2 && ans.get(0) > ans.get(1)){
            int temp = ans.get(0);
            ans.set(0, ans.get(1));
            ans.set(1, temp);
        }

        return ans;
    }
}

/*
    Alternative Approach(Using Hashing):
    Time Complexity: O(n)
    Space Complexity: O(n)

    class Solution {
        public List<Integer> findMajority(int[] nums) {
            HashMap<Integer, Integer> m = new HashMap<>();
            ArrayList<Integer> res = new ArrayList<>();
            for(int ele: nums){
                m.put(ele, m.getOrDefault(ele, 0) + 1);
            }
            
            for(int ele: m.keySet()){
                if(m.get(ele) > nums.length/3){
                    res.add(ele);
                }
            }
               
            if (res.size() == 2 && res.get(0) > res.get(1)) {
                int temp = res.get(0);
                res.set(0, res.get(1));
                res.set(1, temp);
            }
            
            return res;
        }
    }
*/