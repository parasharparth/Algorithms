package CY2022.july02.Sorting;

public class BubbleSort {

    public static void main(String args[])
    {
        //The first step is to get the input array
        int[] arr ={0,9,8,7,6,5,4,3,2,1};

        //Step-2:- Print the unsorted array
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();

        //Step-3:- Call the bubble sort function
        int[] result = bubbleSort(arr);

        //Step-4:- Print the sorted array
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for(int j=0;j<arr.length-i-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
