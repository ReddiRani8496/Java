public class BestTimeToBuyAndSell {
    int maxProfit(int[] prices) {
        int maxProfit = 0;
        int len = prices.length;
        if(len == 1)
            return maxProfit;

        int left = 0;

        for(int right = 0; right < len; right++) {
            if(prices[right] > prices[left]){
                int curProfit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit,curProfit);
            }
            else {
                left = right;
            }
        }
        return maxProfit;
    }
    
}
