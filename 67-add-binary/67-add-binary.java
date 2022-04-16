class Solution 
{
    public String addBinary(String a, String b) 
    {
        String small = "";
        String big = "";
        String finString = "";
        int carry = 0;
        int index = 0;
        
        if (a.length() < b.length())
        {
            small = a;
            big = b;
        }
        else
        {
            small = b;
            big = a;
        }
        
        int smallLength = small.length() - 1;
        int bigLength = big.length() - 1;
        
        while (smallLength != -1)
        {
            char ch1 = small.charAt(smallLength);
            char ch2 = big.charAt(bigLength);
            
            // System.out.println(finString + " " + ch1 + " " + ch2);
            
            if (ch1 == '0' && ch2 == '0')
            {
                if (carry == 0)
                {
                    finString = '0' + finString;
                }
                else
                {
                    finString = '1' + finString;
                    carry = 0;
                }
            }
            else
            {
                if ( (ch1 == '0' && ch2 == '1') || (ch1 == '1' && ch2 == '0') )
                {
                    if (carry == 0)
                    {
                        // System.out.println("HELLO");
                        finString = '1' + finString;
                    }
                    else
                    {
                        finString = '0' + finString;
                        carry = 1;
                    }
                }
                else
                {
                    if (carry == 0)
                    {
                        finString = '0' + finString;
                        carry = 1;
                    }
                    else
                    {
                        finString = '1' + finString;
                        carry = 1;
                    }
                }
            }
            
            smallLength--;
            bigLength--;
            index++;
        }
        
        bigLength = big.length() - 1;
        while (bigLength - index != -1)
        {
            char ch = big.charAt(bigLength - index);
            
            if (carry == 0)
            {
                finString = ch + finString;
            }
            else
            {
                if (ch == '0')
                {
                    finString = '1' + finString;
                    carry = 0;
                }
                else
                {
                    finString = '0' + finString;
                    carry = 1;
                }
                
                
            }
            index++;
        }
        
        if (carry == 1)
        {
            finString = '1' + finString;
        }
        
        return finString;
    }
}