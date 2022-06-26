package June25.sorting;

import June25.utils.InputArray;
import June25.utils.Output;
import June25.utils.PrintArray;

public class OptimizedBubbleSort {
    public static void main(String args[])
    {
        Output.output("The unsorted array is: ");
        PrintArray.printArray(InputArray.input());
        Output.output("The sorted array is: ");
        PrintArray.printArray(optimizedBubbleSort(InputArray.input(),5,0,InputArray.input().length-1));
    }
    public static int[] optimizedBubbleSort(int[] arr, int element, int low,int high)
    {
        for(int i=0; i<arr.length-1;i++)
        {
            boolean swapped = false;
            for(int j=0; j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
            {
                break;
            }
        }
        return arr;
    }
}
