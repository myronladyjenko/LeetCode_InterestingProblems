class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        String str ="";
        int max=0;
        int min=0;
        int f=0;
        int check=0;
        
        for (int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            
            if (str.indexOf(ch)!=-1)
            {
                check = str.indexOf(ch);
                min = str.length();
                max=str.length();
                str=str.substring(check+1,min);
            }
            
            str = str + ch;
            f=Math.max(f,str.length()); 
        }
        return f;
    }
}