package June24;

public class QuickSort {

    public static void main(String args[])
    {
        int[] arr = InputArray.input();
        System.out.println("the unsorted array is: ");
        PrintArray.printArray(arr);
        System.out.println();
        System.out.println("The sorted array is: ");
        quickSort(arr,0,arr.length-1);
        PrintArray.printArray(arr);
    }

    public static void quickSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }

    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int initial = low-1;

        for(int i=low; i<high;i++)
        {
            if(arr[i] <= pivot)
            {
                //swap with the greater element
                initial++;
                int temp = arr[initial];
                arr[initial] = arr[i];
                arr[i] = temp;
            }
        }

        //swap the pivot element with the current value of initial which is greater than the pivot.
        int temp = arr[initial+1];
        arr[initial+1] = arr[high];
        arr[high] = temp;

        return initial+1;
    }
}
