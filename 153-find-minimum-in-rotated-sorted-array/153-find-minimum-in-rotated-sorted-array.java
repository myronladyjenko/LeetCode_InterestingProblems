class Solution 
{
    public int findMin(int[] nums) 
    {
        if (nums.length == 1)
        {
            return nums[0];
        }
        
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        
        if (nums[right] > nums[left])
        {
            return nums[0];
        }
        
        while (left < right)
        {
            mid = (right + left) / 2;
            
            if (nums[mid] > nums[mid + 1])
            {
                return nums[mid + 1];
            }
            
            if (nums[mid - 1] > nums[mid])
            {
                return nums[mid];
            }
            
            
            if (nums[mid] > nums[left])
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        
        return nums[mid - 1];
    }
}