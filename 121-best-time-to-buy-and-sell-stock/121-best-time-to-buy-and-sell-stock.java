class Solution 
{
    public int maxProfit(int[] prices) 
    {
        if (prices.length == 1)
        {
            return 0;
        }
        
        int buy = 10001;
        int sell = -1;
        int profit = 0;
        
        for (int i = 0; i < prices.length; i++)
        {
            
            if (prices[i] <= buy)
            {
                buy = prices[i];
                // sell = -1;
            }
            else
            {
                if (prices[i] - buy >= profit)
                {
                    profit = prices[i] - buy;
                }
            }
            
            /*
            if (currPrice >= sell)
            {
                sell = currPrice;
            } */
        }
        
        return profit;
        
    }
}