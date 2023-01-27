package CY2022.July01.sorting;

public class BubbleSort {

    public static void main(String args[]) {
        //first step is to get the array
        int[] arr = {1, 9, 0, 8, 7, 6, 5, 2, 3, 4};

        //The second step is to print the unsorted array
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();

        int[] result = bubbleSort(arr);
        System.out.println("The sorted array is:");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    public static int[] bubbleSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j] > arr[j+1])
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
