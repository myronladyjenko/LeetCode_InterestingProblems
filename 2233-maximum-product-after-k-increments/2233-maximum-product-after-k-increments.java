class Solution 
{
    public int maximumProduct(int[] nums, int k) 
    {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
        long product = 1;
        long modNum = (long) Math.pow(10,9) + 7;
        
        for (int i = 0; i < nums.length; i++)
        {
            pQueue.add(nums[i]);
        }
        
        while (k != 0)
        {
            int elem = pQueue.poll();
            elem += 1;
            pQueue.add(elem);
            k--;
        }
        
        for (int i = 0; i < nums.length; i++)
        {
            product = (product * pQueue.poll()) % modNum;
        }
        
        return (int) product;
    }
}