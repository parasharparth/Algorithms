package June24;

public class BubbleSort {

    public static void main(String args[])
    {
        System.out.println("Unsorted array: ");
        int[] arr = InputArray.input();
        PrintArray.printArray(arr);
        System.out.println();
        int[] result = bubbleSort(arr);
        System.out.println("The sorted array is: -");
        PrintArray.printArray(result);
    }

    public static int[] bubbleSort(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0;j<arr.length-i-1; j++)
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
