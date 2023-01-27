package CY2022.july09.sorting;

import CY2022.july07.utils.Utils;

public class MergeSort {

    public static void main(String[] args)
    {
        //The first step is to get the input array and print the unsorted array
        int[] arr = Utils.getArray();
        Utils.printArray(arr,2);

        //The second step is to call the mergeSort function
        mergeSort(arr,0,arr.length-1);

        //The third step is to print the sorted array
        Utils.printArray(arr,3);
    }

    public static void mergeSort(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int middle = low + (high-low)/2;
            mergeSort(arr,low,middle);
            mergeSort(arr,middle+1,high);
            merge(arr,low,middle,high);
        }
    }

    public static void merge(int[] arr, int low, int middle, int high)
    {
        //The first step is to get the lengths of the new arrays
        int length1 = middle - low + 1;
        int length2 = high - middle;

        //The second step is to declare the new arrays
        int[] arr1 = new int[length1];
        int[] arr2 = new int[length2];

        //The third step is to fill the new arrays
        for(int i=0; i<length1;i++)
        {
            arr1[i] = arr[low+i];
        }
        for(int j=0; j<length2;j++)
        {
            arr2[j] = arr[middle+j+1];
        }

        //The third step is to fill the sorted array
        int i=0;
        int j= 0;
        int k = low;
        while(i<length1 && j<length2)
        {
            if(arr1[i] < arr2[j])
            {
                arr[k] = arr1[i];
                i++;
            }
            else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        //The fourth step is to fill the remaining elements into the sorted array
        while(i<length1)
        {
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(i<length2)
        {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
}
