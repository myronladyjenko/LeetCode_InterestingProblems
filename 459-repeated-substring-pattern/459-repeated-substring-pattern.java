class Solution 
{
    public boolean repeatedSubstringPattern(String s) 
    {
        String check = s + s;
        
        if (check.substring(1, check.length() - 1).contains(s))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}