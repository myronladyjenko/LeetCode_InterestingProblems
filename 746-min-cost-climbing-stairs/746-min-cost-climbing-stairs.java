class Solution 
{
    public int minCostClimbingStairs(int[] cost)
    {
        int one = cost[0];
        int two = cost[1];

        if (cost.length == 2)
        {
            return minV(cost[0], cost[1]);
        }
        
        for (int i = 2; i < cost.length; i++)
        {       
            int valNow = cost[i] + minV(one, two);
            one = two; 
            two = valNow;
        }
        
        return minV(one, two);
    }
    
    public int minV(int a, int b)
    {
        if (a < b)
        {
            return a;
        }
        
        return b;
    }
}