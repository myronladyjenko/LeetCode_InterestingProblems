class Solution
{
    public boolean checkString(String s) 
    {
        int i = 0;
        
        while (true)
        {         
            int firstA = s.indexOf("a");
            int firstB = s.indexOf("b", i);
            
            if (firstB == -1)
            {
                return true;
            }
            
            if (firstA == firstB)
            {
                break;
            }
            
            if (firstA < firstB)
            {
               s = s.replaceFirst("a", "b");
               i++;
            }
            else
            {
                return false;
            } 
        } 
        
        return true;
    }
}