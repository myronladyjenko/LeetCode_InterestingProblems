class Solution 
{
    public int minDeletion(int[] nums) 
    {
        if (nums.length == 1)
        {
            return 1;
        }
        
        int left = 0;
        int pos = 0;

        int numElemDeleted = 0;
        
        while (left < nums.length)
        {
            if (pos % 2 == 0)
            {    
                int elem = nums[left];
                
                while (left + 1 < nums.length && nums[left + 1] == elem)
                {
                    left++;
                    numElemDeleted++;
                }   
            }
            
            left++;
            pos++;
        }
        
        if ( pos % 2 == 0)
        {  
            return numElemDeleted;
        }
        else
        {
            return numElemDeleted + 1; 
        }

    }
}