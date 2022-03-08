class Solution 
{
    public int[] sortArray(int[] arr) 
    {
        return binarySort(arr);
    }
    
    public int findIndex(int[] arr, int elementIndex, int right)
    {
        int left = 0;
        int middle=0;
        
             while(left<right)
             {
                middle=(left+right)/2;
                
                if(arr[elementIndex]==arr[middle])
                {
                    return middle;
                }
                
                if (arr[elementIndex]<arr[middle])
                {
                   right=middle;
                }
                else
                {
                   left=middle+1;
                }
             }
             middle=(left+right)/2;
            
        return middle;
    }
    
    public int[] binarySort(int[] arr)
    {
        int f=1;
        int temp=0;
        int tempN=0;
  
        int[] arrFinal = new int[arr.length];
        
        arrFinal[0]=arr[0];
         
        for (int i=1; i<arr.length; i++)
        {
            arrFinal[i]=arr[i];
            int mid = findIndex(arrFinal, i, f);
            
               if(mid<i)
               {
                  temp=arrFinal[mid];
                  arrFinal[mid]=arr[i];
                  
                  for(int r=mid+1; r<=i; r++)
                  {
                      tempN=arrFinal[r];
                      arrFinal[r]=temp;
                      temp=tempN;
                  }
               }

            f++;
        }
        return arrFinal;
    }
}