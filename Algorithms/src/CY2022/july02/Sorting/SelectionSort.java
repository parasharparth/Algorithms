package CY2022.july02.Sorting;

public class SelectionSort {

    public static void main(String args[])
    {
        //The first step is to input the array
        int[] arr = {0,9,8,7,6,5,4,3,2,1};

        //The second step is to print the unsorted array
        System.out.println("The unsorted array is: -");
        for(int i=0; i<arr.length;i++)
        {
           System.out.print(arr[i]+",");
        }
        System.out.println();
        //The third step is to call the selection sort function
        int[] result = selectionSort(arr);

        //The fourth step is to print the sorted array
        System.out.println("The sorted array is:");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }

    public static int[] selectionSort(int[] arr)
    {
        //Here,we will move the minimum index, find out the minimum index and then swap the element at the minimum index
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
        return arr;
    }
}
