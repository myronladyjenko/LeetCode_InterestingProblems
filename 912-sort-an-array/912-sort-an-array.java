class Solution 
{
    public int[] sortArray(int[] arr) 
    {
        return quickSort(0, arr.length - 1, arr);
    }
    
    public int[] quickSort(int low, int high, int[] arr)
    {
        if (low < high)
        {
            int middleIndex = findPartition(low, high, arr);

            quickSort(low, middleIndex - 1, arr);
            quickSort(middleIndex + 1, high, arr);
        }
        
        return arr;
     }

    public int findPartition(int low, int high, int[] arr)
    {
        int pivot = arr[high];
    
        int index = low - 1;
    
        for (int i = low; i < high; i++)
        {
            if (arr[i] < pivot)
            {
                index++;
                swap(arr, i, index);
            }
        }

        swap(arr, index + 1, high);
        return index + 1;
    } 

    public void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;     
    }
}
