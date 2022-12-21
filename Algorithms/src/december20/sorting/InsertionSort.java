package december20.sorting;

public class InsertionSort {

    public static int[] insertionSort(int[] arr)
    {
        for(int i=1; i<arr.length; i++)
        {
            int j=i-1;
            int key = arr[i];
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
