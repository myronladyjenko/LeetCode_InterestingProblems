class Solution 
{
    public int search(int[] nums, int target) 
    {
        
        int left = 0;
        int mid = 0;
        int right = pivot (nums);
        System.out.println(right);
        
        if (nums[right] == target)
        {
            return right;
        }
        
        if (nums[right] < target && nums[nums.length - 1] >= target)
        {
            left = right + 1;
            right = nums.length - 1;
        }
        else
        {
            right = right - 1;
        }
        
        System.out.println(left + " " + right);
        
        while (left <= right)
        {
            mid = (left + right) / 2;
            System.out.println(mid);
            
            if (nums[mid] == target)
            {
                return mid;
            }
            
            if (nums[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        
        return -1;
        
    }
    
    public int pivot(int[] arr)
    {
        int mid = 0;
        int left = 0;
        int right = arr.length - 1;
        
        if (right == 0)
        {
            return 0;
        }
        
        if (arr[right] > arr[left])
        {
            return 0;
        }
        
        while (left < right)
        {
            mid = (left + right) / 2;
            
            if (arr[mid] > arr[mid + 1])
            {
                return mid + 1;
            }
            
            if (arr[mid - 1] > arr[mid])
            {
                return mid;
            }
            
            if (arr[mid] > arr[left])
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        
        return mid;
    }
}