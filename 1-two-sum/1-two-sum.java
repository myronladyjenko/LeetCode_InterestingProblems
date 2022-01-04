class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer, Integer> table = new HashMap<>();
        int[] arr = new int[2];
        
        for (int i=0; i<nums.length; i++)
        {
            int check = target - nums[i];
            if (table.containsKey(check))
            {
               arr[0]=i;
               arr[1]=table.get(check);
               break;
            }
            table.put(nums[i], i);
        }
      return arr;
    }
}