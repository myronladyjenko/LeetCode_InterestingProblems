class Solution 
{
    public boolean areNumbersAscending(String s) 
    {
        int resF = -1;
        int num = 0;
        
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            
            if (c >= '0' && c <= '9')
            {
               StringBuilder str= new StringBuilder();
                
               while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9')
               {
                   str.append(s.charAt(i));
                   i++;
               }
                
               num = Integer.parseInt(str.toString());
                
               if (num <= resF)
               {
                  return false;
               }
               else 
               {
                  resF = num;
               }
            }
        }
        
        return true;

    }
}