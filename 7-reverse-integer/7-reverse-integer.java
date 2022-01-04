class Solution 
{
    public int reverse(int x) 
        
    {
        int num =0;
        while (x!=0)
        {
            int i= x% 10;
            x /= 10;
            if ( (num>Integer.MAX_VALUE/10) || (num==Integer.MAX_VALUE/10 && i>7) )
            {
                return 0;
            }
            
            if ( (num<Integer.MIN_VALUE/10) || (num==Integer.MIN_VALUE/10 && i<-8) )
            {
                return 0;
            }
            num=num*10+i;
        }
        return num;
    }
}