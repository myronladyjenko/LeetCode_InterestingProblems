class Solution 
{
    public int rob(int[] nums)
    {   
        if (nums.length == 1)
        {
            return nums[0];
        }
        
        if (nums.length == 2)
        {
            return Math.max(nums[0], nums[1]);
        }
        
        return Math.max(findRob(nums, 1, nums.length - 1), findRob(nums, 0, nums.length - 2));       
    }
    
    public int findRob(int[] nums, int left, int right)
    {
        int[] arr = new int[right - left + 1 + 1];
        
        for (int i = 0; i < nums.length; i++)
        {
            arr[i] = 0;
        }
        
        arr[left] = nums[left];
        arr[left + 1] = Math.max(nums[left], nums[left+1]);
        
        for (int i = left+2; i <= right; i++)
        {
            arr[i] = Math.max(arr[i-2] + nums[i], arr[i-1]);
        }
        
        if (left == 1)
        {
            return arr[right-left + 1];
        }
        
        return arr[right-left];
        
    }
}