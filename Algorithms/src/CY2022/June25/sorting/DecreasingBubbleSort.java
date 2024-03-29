package CY2022.June25.sorting;

import CY2022.June25.utils.InputArray;
import CY2022.June25.utils.Output;
import CY2022.June25.utils.PrintArray;

public class DecreasingBubbleSort {

    public static void main(String args[])
    {
        Output.output("The unsorted array is: ");
        PrintArray.printArray(InputArray.input());
        Output.output("The sorted array is: ");
        PrintArray.printArray(decreasingBubbleSort(InputArray.input()));
    }
    public static int[] decreasingBubbleSort(int[] arr)
    {
        for(int i=0; i<arr.length-1;i++)
        {
            for(int j=0; j<arr.length-i-1;j++)
            {
                if(arr[j]<arr[j+1])
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
