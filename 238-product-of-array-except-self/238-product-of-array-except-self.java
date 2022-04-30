class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        
        int[] answer = new int[nums.length];
        answer[0] = 1;
        
        int prev = 1;
        
        // left prodcuct
        for (int i = 1; i < nums.length; i++)
        {
            answer[i] = nums[i - 1] * answer[i - 1];
        }
        
        // right product 
        for (int i = nums.length - 1; i >= 0; i--)
        {
            answer[i] = prev * answer[i];
            prev *= nums[i];
        }
        
        return answer;
    }
}