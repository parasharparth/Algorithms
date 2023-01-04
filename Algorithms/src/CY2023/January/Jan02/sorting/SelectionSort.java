package CY2023.January.Jan02.sorting;

public class SelectionSort {

    public static int[] selectionSort(int[] arr)
    {
        for(int i:arr)
        {
            int minimum_index = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j] < arr[minimum_index])
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
