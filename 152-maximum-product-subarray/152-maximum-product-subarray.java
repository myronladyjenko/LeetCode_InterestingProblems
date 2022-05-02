class Solution 
{
    public int maxProduct(int[] nums) 
    {
        int maxCurr = nums[0];
        int minCurr = nums[0];
        
        int max = nums[0];
        
        for (int i = 1; i < nums.length; i++)
        {
            int storeMinCurr = maxCurr;
            
            maxCurr = Math.max(nums[i], Math.max(nums[i] * maxCurr, nums[i] * minCurr));
            minCurr = Math.min(nums[i], Math.min(nums[i] * storeMinCurr, nums[i] * minCurr));
            
            max = Math.max(maxCurr, max);
        }
        
        return max;
        
    }
}