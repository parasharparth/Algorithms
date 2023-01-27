package CY2022.July01.sorting;

public class QuickSort {

    public static void main(String args[])
    {
        //The first step is to have the initial unsorted array
        int[] arr = {0,9,8,7,6,5,4,3,2,1};

        //The second step is to print the unsorted array
        System.out.println("The unsorted array is: ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();

        //The third step is to call the quicksort function
        int[] result = quickSort(arr,0,arr.length-1);

        //The fourth step is to print the sorted array
        System.out.println("The sorted array is: ");
        for(int i=0; i<result.length;i++)
        {
            System.out.print(result[i]+",");
        }
    }

    public static int[] quickSort(int[] arr, int low, int high)
    {
         if(low < high)
         {
             int middle = low + (high-low)/2;
             int pivot = partition(arr,low,middle,high);
             quickSort(arr,low,pivot-1);
             quickSort(arr,pivot+1,high);
         }
         return arr;
    }

    public static int partition(int[] arr, int low , int middle, int high)
    {
        int pivot = arr[high];
        int initial = low - 1;

        for(int i=low; i<high;i++)
        {
            if(arr[i] <= pivot)
            {
                initial++;
                int temp = arr[i];
                arr[i] = arr[initial];
                arr[initial] = temp;
            }
        }
        int temp = arr[high];
        arr[high] = arr[initial+1];
        arr[initial+1] = temp;

        return initial + 1;
    }
}
