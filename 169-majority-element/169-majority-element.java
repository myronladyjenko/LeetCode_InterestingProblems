class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int maxNum = 0;
        int element = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int elem : nums)
        {
            map.put(elem, 0);
        }
        
        for (int elem : nums)
        {
            map.put(elem, map.get(elem) + 1);
        }
        
        for (int elem : nums)
        {
            int max = map.get(elem);
            
            if (max > maxNum)
            {
                maxNum = max;
                element = elem;
            }
        }
        
        return element;
    }
}