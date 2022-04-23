class Solution 
{
    public int nthUglyNumber(int n) 
    {
        
        if (n == 1)
        {
            return 1;
        }
        
        if (n == 2)
        {
            return 2;
        }
        
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        long[] dp = new long[n];
        
        dp[0] = 1;
        
        pq.add((long) 2);
        pq.add((long) 3);
        pq.add((long) 5);
        
        for (int i = 1; i < n; i++)
        {
            if (pq.isEmpty())
            {
                break;
            }
            
            while (pq.peek() <= dp[i - 1])
            {
                pq.poll();
            }
            
            long num = pq.poll();
            dp[i] = num;
            
            pq.add(num * 2);
            pq.add(num * 3);
            pq.add(num * 5);
            
        }
        
        /*
        for (int i = 0; i < n; i++)
        {
            System.out.println(dp[i]);
        } */
        
        return (int) dp[n -  1];
    }
}