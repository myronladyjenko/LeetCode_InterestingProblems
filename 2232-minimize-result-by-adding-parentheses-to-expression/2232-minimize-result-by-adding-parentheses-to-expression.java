class Solution 
{
    public String minimizeResult(String expression) 
    {
        int countL = 0;
        int[][] arrL = new int[8][2];
        int[][] arrR = new int[8][2];
        int[] arr = new int[expression.length()];
        int numInArrL = 0;
        int numInArrR = 0;
        
        for (int i = 0; i < 8; i++)
        {
            arrL[i][0] = 0;
            arrL[i][1] = 0;
            arrR[i][0] = 0;
            arrR[i][1] = 0;
        }
        
        for (int i = 0; i < expression.length(); i++)
        {
            if (expression.charAt(i) != '+')
            {
                 arr[i] = (expression.charAt(i) - '0'); 
            }
            else
            {
                arr[i] = -1;
            }
        }
        
        /*
        for (int i = 0; i < expression.length(); i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); */
        
        while (arr[countL] != -1)
        {
            
            if (countL == 0)
            {
                arrL[0][0] = 1;
            }
            
            for (int i = 0; i < countL; i++)
            {
                arrL[countL][0] = arrL[countL][0] * 10 + arr[i];
            }
            
            int index2 = countL;
            
            while (arr[index2] != -1)
            {
                arrL[countL][1] = arrL[countL][1] * 10 + arr[index2];
                index2++;
            }
            
            countL++;
            numInArrL++;
        }
        
        
        
        int arrayIndex = 0;
        countL = countL + 1;
        int temp = countL;
        
        while(countL < expression.length())
        {
            
            for (int i = temp; i <= countL; i++)
            {
                arrR[arrayIndex][0] = arrR[arrayIndex][0] * 10 + arr[i];
            }
            
            int index2 = countL + 1;
            if (index2 >= expression.length())
            {
                arrR[arrayIndex][1] = 1;
            }
            
            while (index2 < expression.length())
            {
                arrR[arrayIndex][1] = arrR[arrayIndex][1] * 10 + arr[index2];
                index2++;
            }
            
            arrayIndex++;
            numInArrR++;
            countL++;
        } 
        
        /*
        for (int i = 0; i < numInArrL; i++)
        {
            System.out.println(arrL[i][0] + " " + arrL[i][1]);
        }
        
        System.out.println("-------------");
        
        
        for (int i = 0; i < numInArrR; i++)
        {
            System.out.println(arrR[i][0] + " " + arrR[i][1]);
        } */
        
        int minNum = 2147483647;
        int o = 0;
        int b = 0;
        int u = 0;
        int y = 0;
        
        for (int i = 0; i < numInArrL; i++)
        {
            int one = arrL[i][0];
            int two = arrL[i][1];
            
            for (int j = 0; j < numInArrR; j++)
            {
                int min = one * (two + arrR[j][0]) * arrR[j][1];
                // System.out.println(min);
                if (min < minNum)
                {
                    minNum = min;
                    o = i;
                    u = j;
                }
            }
        }
        
        // System.out.println("Number: " + minNum);
        String str = "";
        int flag = 0;
        // System.out.println("o and u: " + o + " " + u);
        
        for (int i = 0; i < expression.length(); i++)
        {
            if (expression.charAt(i) == '+')
            {
                flag = 1;
            }
            
            if (i == o)
            {
                str = str + "(" + expression.charAt(i);
            }
            
            if (flag == 1 && i == u + numInArrL + 1)
            {
                str = str + expression.charAt(i) + ")";
            }
            
            if (i != o && i != u + numInArrL + 1)
            str = str + expression.charAt(i);
        }
        
        return str;
        
    }
}