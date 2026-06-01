class Solution {
    public int maxProfit(int[] prices) {
        int min_price=prices[0];
        int profit =0;
        int max_profit=profit;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>min_price){
                profit=prices[i]-min_price;
                if(max_profit<profit){
                    max_profit=profit;
                }
            }
            else if (prices[i]<min_price){
                min_price=prices[i];
            }
        }
        return max_profit;
    }
}