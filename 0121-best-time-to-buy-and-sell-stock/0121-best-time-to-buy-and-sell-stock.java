class Solution {
    public int maxProfit(int[] prices) {
      int min=9999;int max=-1;int totalProfit=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]) { 
                max=Math.max(max,prices[i+1]);
                min=Math.min(min,prices[i]);
                totalProfit=Math.max(totalProfit,max-min);
            }
            else {
                max=0;
            }
        }
        return totalProfit;  
    }
}