class Solution 
{
    public boolean isUgly(int n) 
    {
        int[] arr = {2, 3, 5};
        
        if (n < 1)
        {
            return false;
        }
        
        if (n == 1)
        {
            return true;
        }
        
        for (int num: arr)
        {
            while (n % num == 0)
            {
                n = n / num;
            }
        }
        
        if (n == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}