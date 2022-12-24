/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.*/
class Solution {
    public int maxProfit(int[] prices) {
        int i,j,n=prices.length;
        int mx[]=new int[prices.length];
        mx[n-1]=prices[n-1];
        for(i=n-2;i>=0;i--)
        {
            mx[i]=Math.max(prices[i],mx[i+1]);
        }
        int ans=0;
        for(i=0;i<n;i++)
        {
            ans=Math.max(ans,mx[i]-prices[i]);
        }
       return ans;
    }
}
