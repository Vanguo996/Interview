package Leetcode.array;

public class StockMaxprofit {
    //买股票最佳时机1，暴力法。
    public int stock1(int[] prices) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length -1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit;
    }

    //单次遍历，只关心卖出价格和最低价格之间的插值，波峰和波谷之间的差值。
    //买股票最佳时机2，valley and peak.
    public int stock2(int[] prices) {
        int max = 0;
        //关键是记录 peak - valley 的值


        return max;
    }
}
