package June25.sorting;

import June25.utils.InputArray;
import June25.utils.Output;
import June25.utils.PrintArray;

public class MergeSort {

    public static void main(String args[])
    {
        Output.output("The unsorted array is: ");
        PrintArray.printArray(InputArray.input());
        Output.output("The sorted array is: ");
        int[] arr = InputArray.input();
        PrintArray.printArray(mergeSort(arr,0, arr.length-1));
    }
    public static int[] mergeSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int middle = low + (high-low)/2;
            mergeSort(arr,low,middle);
            mergeSort(arr,middle+1,high);
            merge(arr,low,middle,high);
        }
        return arr;
    }

    public static void merge(int[] arr, int low, int middle, int high) {
        //the first step in merge is to define new arrays
        int length1 = middle - low + 1;
        int length2 = high - middle;
        int[] arr1 = new int[length1];
        int[] arr2 = new int[length2];

        //populate the new arrays
        for (int i = 0; i < length1; i++) {
            arr1[i] = arr[low + i];
        }
        for (int j = 0; j < length2; j++) {
            arr2[j] = arr[middle + 1 + j];
        }

        //Define the iterative integers
        int i = 0;
        int j = 0;
        int k = low;
        while (i < length1 && j < length2) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            }
            else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        //put the rest in the array
        while (i < length1) {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < length2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
}
