package october20.sorting;

public class SelectionSort {

    public static int[] selectionSort(int[] arr)
    {
        for(int i:arr)
        {
            int minimum_index = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[minimum_index] > arr[j])
                {
                    minimum_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minimum_index];
            arr[minimum_index] = temp;
        }
        return arr;
    }
}
