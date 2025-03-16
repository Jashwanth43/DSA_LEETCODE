class Solution {
    public int maxProfit(int[] prices) {

        int profit=0;
        int buy=prices[0];
        for(int i=0;i<prices.length-1;i++){
            if(buy>prices[i+1] && (i+1)!=prices.length-1)
            {   
                buy=prices[i+1];

            }else{
            profit=Math.max(profit,prices[i+1]-buy);
            }
        }
        return profit;
    }
}