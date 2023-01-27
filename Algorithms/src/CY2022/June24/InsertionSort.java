package CY2022.June24;

public class InsertionSort {

    public static void main(String args[])
    {
        System.out.println("the unsorted array is:");
        int[] arr = InputArray.input();
        PrintArray.printArray(arr);
        System.out.println();
        System.out.println("the sorted array is:");
        int[] result = insertionSort(arr);
        PrintArray.printArray(result);
    }
    public static int[] insertionSort(int[] arr)
    {
        for(int i=1; i<arr.length;i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key > arr[j]) //This key </> determines the ascending/descending order
            {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] =  key;
        }
        return arr;
    }
}
