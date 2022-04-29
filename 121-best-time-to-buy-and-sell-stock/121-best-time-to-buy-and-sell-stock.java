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
        int profit = -1;
        
        int currPrice = 0;
        
        for (int i = 0; i < prices.length; i++)
        {
            currPrice = prices[i];
            
            if (currPrice <= buy)
            {
                buy = currPrice;
                sell = -1;
            }
            
            if (currPrice >= sell)
            {
                sell = currPrice;
            }
            
            if (sell - buy >= profit)
            {
                profit = sell - buy;
            }
        }
        
        if (profit <= 0)
        {
            return 0;
        }
        else
        {
            return profit;
        }
        
    }
}