class Solution 
{
    public long smallestNumber(long num) 
    {
        long[] arr = new long[16];
        int count = 0;
        long numF;
        
        if (num == 0)
        {
            return num;
        }
        
        while (num != 0)
        {
           arr[count] = num % 10;
           count++;
           num = num / 10;
        }
        
        Arrays.sort(arr, 0, count);
        
        /*
        for (int i = 0; i < count; i++)
        {
            System.out.println(arr[i]);
        } */
        
        int flag = 0;
        
        while (arr[flag] == 0)
        {
            flag ++;
        }
        
            
         numF = arr[flag];
        
         int flagF = flag + 1; 
         
         flag = flag - 1;
           // System.out.println("Hahaha" + flag);
            
         while (flag >= 0)
         {
             numF = numF * 10 + arr[flag];
             flag--;
         }
         
        
         for (int i = flagF; i < count; i++)
         {
             numF = numF * 10 + arr[i];
         }
        
        return numF;
        
        
    }
}