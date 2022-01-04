import java.lang.Math;

class Solution 
{
    public int maxSubArray(int[] nums)
    {
        int maxValueUpToHere = 0;
        int maxValue = 0;
        int minValue = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++)
        {
            maxValueUpToHere = maxValueUpToHere + nums[i];
            
            if (maxValueUpToHere < 0)
            {
                 maxValueUpToHere = 0;
            }
            
            if (maxValue < maxValueUpToHere)
            {
                maxValue = maxValueUpToHere;
            }
            
            if (nums[i] > minValue)
            {
                minValue = nums[i];
            }
        }
        
        if (maxValue == 0)
        {
            return minValue;
        }
        
        return maxValue;
    }
}