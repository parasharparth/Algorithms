package august10.sorting;

import august10.utils.Utils;

public class InsertionSort {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.printArray(insertionSort(Utils.getArray()),3);
    }

    public static int[] insertionSort(int[] arr)
    {
        for(int i=1; i<arr.length; i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
