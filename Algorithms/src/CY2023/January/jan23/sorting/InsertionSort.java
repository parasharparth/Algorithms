package CY2023.January.jan23.sorting;

public class InsertionSort {

    public static int[] insertionSort(int[] arr)
    {
        for(int i=1; i<arr.length; i++)
        {
            int key = arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j])
            {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
