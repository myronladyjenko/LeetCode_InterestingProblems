class Solution
{
    public boolean checkString(String s) 
    {
        int check = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i)=='b')
            {
               check = 1;
            }
            if (check == 1 && s.charAt(i) == 'a')
            {
               return false;
            }
        }
        
        return true;
    }
}