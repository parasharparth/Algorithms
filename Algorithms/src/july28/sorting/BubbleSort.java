package july28.sorting;

import july28.utils.Utils;

public class BubbleSort {

    public static void main(String[] args)
    {
        Utils.printArray(Utils.getArray(),2);
        Utils.printArray(bubbleSort(Utils.getArray()),3);
    }

    public static int[] bubbleSort(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
