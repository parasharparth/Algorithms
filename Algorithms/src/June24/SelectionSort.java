package June24;

public class SelectionSort {

    public static void main(String args[])
    {
        int[] arr = InputArray.input();
        System.out.println("The unsorted array is: ");
        PrintArray.printArray(arr);
        System.out.println();
        int[] result = selectionSort(arr);
        System.out.println("The sorted array is: ");
        PrintArray.printArray(result);
    }
    public static int[] selectionSort(int[] arr)
    {
        for(int i=0 ; i<arr.length; i++)
        {
            int minimum_index = i;
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[j] < arr[minimum_index])
                {
                    minimum_index = j;
                }
            }
            int temp = arr[minimum_index];
            arr[minimum_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
