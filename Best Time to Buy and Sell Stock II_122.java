public class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        if(prices.length<2)
            return 0;
        for(int i=1;i<=prices.length-1;i++)
            if(prices[i]>prices[i-1])
                res += prices[i] - prices[i-1];
    
        return res;
    }
}
