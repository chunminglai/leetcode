public class Solution {
    public int maxProfit(int[] prices) {
            int res=0;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<prices.length;i++){
                if(prices[i] < min)
                    min = prices[i];
                if(prices[i]-min > res)
                    res = prices[i]-min;
            }
            return res;
        }
}
