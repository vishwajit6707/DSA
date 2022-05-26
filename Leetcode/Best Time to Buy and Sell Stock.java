https://leetcode.com/problems/best-time-to-buy-and-sell-stock/


class Solution {
    public int maxProfit(int[] prices) {
     int max = 0;
		 int i = 0;
		 int j = 1;
		 while(j<prices.length) {
         if(prices[i]>prices[j]) {	
        	i++;
        	j=i+1;
         }
         else {
        	 max = Math.max(max, prices[j]-prices[i]);
        	 j++;
         }	
         }
		 return max;   
    }
}
