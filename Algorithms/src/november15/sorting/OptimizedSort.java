package november15.sorting;

public class OptimizedSort {

    public static int[] optimizedSort(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            boolean swapped = false;
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
        return arr;
    }
}
