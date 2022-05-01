import java.lang.Math;

class Solution 
{
    public int maxSubArray(int[] nums)
    {
        int currentSum = 0;
        int finalSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++)
        {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            
            if (currentSum > finalSum)
            {
                finalSum = currentSum;
            }
        }
        
        return finalSum;
    }
}