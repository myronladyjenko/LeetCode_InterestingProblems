class Solution 
{
    public int tribonacci(int n) 
    {
        int oneBefore = 1;
        int twoBefore = 1;
        int threeBefore = 0;
        int curr = 0;
        
        if (n == 1 || n == 2)
        {
            return 1;
        }
        
        for (int i = 2; i < n; i++)
        {
            curr = oneBefore + twoBefore + threeBefore;
            threeBefore = twoBefore;
            twoBefore = oneBefore;
            oneBefore = curr;
        }
        
        return curr;
    }
}