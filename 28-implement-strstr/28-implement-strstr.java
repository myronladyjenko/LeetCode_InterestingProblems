class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        if (needle.equals(""))
        {
            return 0;
        }
        else
        {
            int indEx = haystack.indexOf(needle);
            return indEx;
        }
    }
}