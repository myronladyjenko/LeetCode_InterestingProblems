class Solution 
{
    public int myAtoi(String s) 
    {
        int currIndex = 0;
        int detSign = 1;
        int finNum = 0;
        
        while (currIndex < s.length() && s.charAt(currIndex) == ' ')
        {
            currIndex++;
        }
        
        if (currIndex < s.length() && s.charAt(currIndex) == '-')
        {
            detSign = -1;
            currIndex++;
        }
        else
        {
            if (currIndex < s.length() && s.charAt(currIndex) == '+')
            {
                detSign = 1;
                currIndex++;
            }
        }
        
        while (currIndex < s.length() && Character.isDigit(s.charAt(currIndex)))
        {
            int num = s.charAt(currIndex) - '0';
            
            if ((finNum > Integer.MAX_VALUE / 10) || 
                (finNum == Integer.MAX_VALUE / 10 && num > Integer.MAX_VALUE % 10))
            {        
                if (detSign == 1)
                {
                    return Integer.MAX_VALUE;
                }
                else
                {
                    return Integer.MIN_VALUE;
                }
            }
            
            finNum = 10 * finNum + num;
            currIndex++;
        }
        
        return detSign * finNum;
        
    }
}