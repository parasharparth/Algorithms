package CY2022.July01.sorting;

public class InsertionSort {

    public static void main(String args[])
    {
        int[] arr = {0,9,8,7,6,5,4,3,2,1};
        System.out.println("The unsorted array is: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();

        int[] result = insertionSort(arr);
        System.out.println("The sorted array is: ");
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i]+",");
        }
    }

    public static int[] insertionSort(int[] arr)
    {
        for(int i=1; i<arr.length;i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key < arr[j])
            {
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
