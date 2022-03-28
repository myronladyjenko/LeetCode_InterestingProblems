class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        int toGo = 0;
        int flag = 0;
        int[] arr;
        int num = 0;
        int check = 0;
        
        for (int i = 0; i < digits.length; i++)
        {
            if (digits[i] != 9)
            {
                flag = 1;
                break;
            }
        }
        
        if (flag == 1)
        {
            arr = new int[digits.length];
        }
        else
        {
            arr = new int[digits.length + 1];
        }

        
        for (int i = digits.length - 1; i >= 0; i--)
        {
            if (check == 0)
            {
                num = digits[i] + 1 + toGo;
                check = 1;
            }
            else
            {
                num = digits[i] + toGo;
            }
            
            // System.out.println(num);
            
            if (num >= 10)
            {
                toGo = 1;
                if (flag == 1)
                {
                    arr[i] = (num % 10);
                }
                else
                {
                    arr[i + 1] = (num % 10);
                }
            }
            else
            {
                toGo = 0;
                if (flag == 1)
                {
                    arr[i] = num;
                }
                else
                {
                    arr[i + 1] = num;
                }
            }
        }
        
        if (flag != 1)
        {
           arr[0] = 1;   
        }
        
        return arr;
    }
}