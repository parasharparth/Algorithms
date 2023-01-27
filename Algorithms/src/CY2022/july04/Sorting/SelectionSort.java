package CY2022.july04.Sorting;

public class SelectionSort {

    public static void main(String[] args)
    {
        int[] arr = {0,9,8,7,6,5,4,3,2,1};
        System.out.println("The unsorted array is: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();
        selectionSort(arr);
        System.out.println("The sorted array is: ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }

    public static void selectionSort(int[] arr)
    {
        for(int i=0; i<arr.length;i++)
        {
            int minimum_index = i;
            for(int j=i+1;j<arr.length;j++)
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
    }
}
