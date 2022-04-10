class Solution 
{
    public int largestInteger(int num) 
    {
        int[] arr = new int[10];
        int[] brr = new int[10];
           int i = 0; 
           int count = 0; 
            int currElem = 0;
            int swapElem = 0;
            int temp = 0;
            int finalVal = 0;
            int maxOdd = -1;
            int maxEven = -1; 

           while (num != 0)
           {
               arr[i] = num % 10;
               num = num / 10;
               i++;
               count++;
           }
        
            
            int index = 0;
            for (int m = count - 1; m >= 0; m--)
            {
                brr[index] = arr[m];
                index++;
            }


            for (int j = 0; j < count; j++)
            {
                maxOdd = -1;
                maxEven = -1; 
                currElem = brr[j];
                for (int k = j; k < count; k++)
                {
                    swapElem = brr[k];
                    if (currElem % 2 == 0 && swapElem % 2 == 0 && swapElem > currElem && maxEven < swapElem)
                    {
                        maxEven = swapElem;
                        temp = brr[j];
                        brr[j] = brr[k];
                        brr[k] = temp;
                    }

                    if (currElem % 2 == 1 && swapElem % 2 == 1 && swapElem > currElem && maxOdd < swapElem)
                    {
                        maxOdd = swapElem;
                        temp = brr[j];
                        brr[j] = brr[k];
                        brr[k] = temp;
                    }
                }
            }

            for (int m = 0; m < count; m++ )
            {
                finalVal = 10 * finalVal + brr[m];
            }

            return finalVal;
    }
}
