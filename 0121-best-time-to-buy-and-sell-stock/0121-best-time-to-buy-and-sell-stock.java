class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int profit=0;
        int buy=prices[0];
        int sell=0;
        for(int sell2:prices){
            buy=Math.min(sell2,buy);
            profit=sell2-buy;
            sell=Math.max(profit,sell);
        } 
        return sell;
    }
}