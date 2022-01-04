class Solution 
{
    public int deleteAndEarn(int[] nums) 
    {
       if (nums.length == 1)
       {
           return nums[0];
       }
        
       int max = 0;
        
       for (int k = 0; k < nums.length; k++)
       {
           max = Math.max(max, nums[k]);
       }
        
       max = max + 1; 
        
       int[] curr = new int[max]; 
        
       for (int j = 0; j < max; j++)
       {
           curr[j] = 0;
       }
      
       for(int elem : nums) 
       {
           curr[elem]++;
       }
        
       int[] arr = new int[max];
       arr[1] = curr[1];
       arr[2] = Math.max(curr[1], 2*curr[2]);

        for (int i = 3; i < max; i++) 
        {
            if(curr[i] != 0) 
            {
                arr[i] = Math.max(curr[i]*i + arr[i-2], arr[i-1]);
            } 
            else
            {
                arr[i] = arr[i-1];
            }
        }
        
        return arr[max -1];
    }
}