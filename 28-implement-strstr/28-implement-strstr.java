class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        int check = -1; 
        String s;
        
        if (needle.length() == 0)
        {
            return 0;
        }
        
        if (needle.length() > haystack.length())
        {
            return -1;
        }
        
        int length = needle.length();
        
        for (int i = 0; i < haystack.length(); i++)
        {
            if (i + length <= haystack.length())
            {
               s = haystack.substring(i, i + length);
            }
            else
            {
                break;
            }
            
            if (needle.equals(s))
            {
                check = i;
                break;
            }
        }
        
        return check;
    }
}