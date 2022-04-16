class ATM 
{
    long[] count;
    
    public ATM() 
    {
        count = new long[5];
    }
    
    public void deposit(int[] banknotesCount) 
    {
        for (int i = 0; i < 5; i++)
        {
            count[i] += banknotesCount[i]; 
        }
    }
    
    public int[] withdraw(int amount) 
    {
        int[] withDraw = new int[5]; 
        long[] temp = new long[5];
        long sum = 0;
        
        for (int i = 0; i < 5; i++)
        {
            temp[i] = count[i]; 
        }
        
        sum += 20 * count[0];
        sum += 50 * count[1];
        sum += 100 * count[2];
        sum += 200 * count[3];
        sum += 500 * count[4];
        
        // System.out.println(sum);
        
        if (sum < amount)
        {
            int[] arr = new int[1];
            arr[0] = -1;
            return arr;
        }
        
        
        // 500
        int num1 = amount / 500;
        if (num1 != 0)
        {
            if (count[4] >= num1)
            {
                amount = amount - 500 * num1;
                count[4] -= num1;
                withDraw[4] += num1;
            }
            else
            {
                amount = amount - 500 * (int)count[4];
                withDraw[4] += (int)count[4];
                count[4] = 0;
            }
        }
        
        // 200
        num1 = amount / 200;
        if (num1 != 0)
        {
            if (count[3] >= num1)
            {
                amount = amount - 200 * num1;
                count[3] -= num1;
                withDraw[3] += num1;
            }
            else
            {
                amount = amount - 200 * (int)count[3];
                withDraw[3] += (int)count[3];
                count[3] = 0;
            }
        }
        
        // 100
        num1 = amount / 100;
        if (num1 != 0)
        {
            if (count[2] >= num1)
            {
                amount = amount - 100 * num1;
                count[2] -= num1;
                withDraw[2] += num1;
            }
            else
            {
                amount = amount - 100 * (int)count[2];
                withDraw[2] += (int)count[2];
                count[2] = 0;
            }
        }
        
        
        // 50
        num1 = amount / 50;
        if (num1 != 0)
        {
            if (count[1] >= num1)
            {
                amount = amount - 50 * num1;
                count[1] -= num1;
                withDraw[1] += num1;
            }
            else
            {
                amount = amount - 50 * (int)count[1];
                withDraw[1] += (int)count[1];
                count[1] = 0;
            }
        }
        
        // 20
        num1 = amount / 20;
        if (num1 != 0)
        {
            if (count[0] >= num1)
            {
                amount = amount - 20 * num1;
                count[0] -= num1;
                withDraw[0] += num1;
            }
            else
            {
                amount = amount - 20 * (int)count[0];
                withDraw[0] += (int)count[0];
                count[0] = 0;
            }
        }
        
        if (amount != 0)
        {
            int[] arr = new int[1];
            arr[0] = -1;
            for (int i = 0; i < 5; i++)
            {
                count[i] = temp[i]; 
            }
            
            return arr;
        }
        
        return withDraw;
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */