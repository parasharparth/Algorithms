package CY2022.july10.Sorting;

import CY2022.july10.utils.Utils;

public class BubbleSort {

    public static void main(String[] args)
    {
        //The first step is get and print the input array
        int[] arr = Utils.getArray();
        Utils.printArray(arr,2);

        //the second step is to call the bubble sort function
        bubbleSort(arr);

        //The third step is to print the sorted array
        Utils.printArray(arr,3);
    }

    public static void bubbleSort(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
