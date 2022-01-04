class Solution 
{
    public int fib(int n) 
    {
        int twoBefore = 0;
        int oneBefore = 1;
        int curr = 0;
        
        if (n == 1)
        {
            return 1;
        }
        
        for (int i = 1; i < n; i++)
        {
           curr = twoBefore + oneBefore;
            twoBefore = oneBefore;
            oneBefore = curr; 
        }
        
        return curr;
    }
}