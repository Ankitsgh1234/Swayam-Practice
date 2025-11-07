package AdvanceArray1;

public class P48_StockBuyAndSell {
  
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // buy at lowest
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // sell at max profit
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr={2,1,2,5};
        System.out.println(maxProfit(arr));
    }
}


