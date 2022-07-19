package july19.sorting;

import july19.utils.Utils;

public class InsertionSort {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.printArray(insertionSort(Utils.getArray()),3);
    }

    public static int[] insertionSort(int[] arr)
    {
        for(int i=1; i<arr.length;i++)
        {
            int pivot = arr[i];
            int j=i-1;
            while(j>=0 && pivot < arr[j])
            {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = pivot;
        }
        return arr;
    }
}
