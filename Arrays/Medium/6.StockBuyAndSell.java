/*
    Stock Buy and Sell – Max one Transaction Allowed
    Given an array prices[] of length n, representing the prices of the stocks on different days. 
    The task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. 
    Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.
    Note: Stock must be bought before being sold.

    Link: https://www.geeksforgeeks.org/problems/buy-stock-2/1

    Time Complexity: O(n)
    Space Complexity: O(1)    
*/

/*
    Hint: Track the minimum price so far and calculate the profit if sold today. 
    Update the maximum profit whenever it's higher.
*/

class Solution {
    public int maximumProfit(int prices[]) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}

/*
    Alternative Approach(Brute Force Approach):
    Time Complexity: O(n^2)
    Space Complexity: O(1)

    class Solution {
        public int maximumProfit(int prices[]) {
            int maxProfit = 0;
            for(int i = 0; i < prices.length - 1; i++){
                for(int j = i + 1; j < prices.length; j++){
                    maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
                }
            }
        
            return maxProfit;
        }
    }
*/