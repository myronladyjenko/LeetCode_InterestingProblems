class Solution 
{
    public boolean isMonotonic(int[] nums) 
    {
        boolean checkIncr = true;
        boolean checkDecr = true;
        
        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] > nums[i + 1])
            {
                checkIncr = false;
            }
            
            if (nums[i] < nums[i + 1])
            {
                checkDecr = false;
            }
        }
        
        return checkIncr || checkDecr;
    }
}