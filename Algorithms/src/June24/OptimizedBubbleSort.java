package June24;

public class OptimizedBubbleSort {

    public static void main(String args[])
    {
        int[] arr = InputArray.input();
        System.out.println("The unsorted array is: ");
        PrintArray.printArray(arr);
        System.out.println();
        int[] result = optimizedBubbleSort(arr);
        System.out.println("The sorted array is: ");
        PrintArray.printArray(result);
    }
    public static int[] optimizedBubbleSort(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            boolean swapped = false;
            for(int j=0; j<arr.length-i-1;j++)
            {
                if(arr[j] > arr[j+1])
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
