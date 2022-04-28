class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] returnIndex = new int[2];
        int checkVal = 0;
        
        for (int i = 0; i < nums.length; i++)
        {
            checkVal = target - nums[i];
            returnIndex[0] = i;
            
            if (!map.containsKey(checkVal))
            {
                map.put(nums[i], i);
            }
            else
            {
                returnIndex[1] = map.get(checkVal);
                break;
            }
        }
        
        return returnIndex;
    }
}