class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int cp = 0;
        int mp = 0;

        for(int i=0; i<prices.length; i++){
            if((prices[i] - buy) > 0){
                cp = prices[i]-buy;
            }

            if(prices[i]<buy){
                buy = prices[i];
            }

            if(cp>mp){
                mp = cp;
            }

        }
        return mp;
    }
}
