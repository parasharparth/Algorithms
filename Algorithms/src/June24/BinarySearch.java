package June24;

public class BinarySearch {

    public static void main(String args[])
    {
        int[] arr = InputArray.input();
        System.out.println("The array present is: -");
        PrintArray.printArray(arr);

        int result = binarySearch(arr,5, 0 , arr.length);
        if(result == -1)
        {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at position: "+result);
        }
    }

    public static int binarySearch(int[] arr, int element, int low, int high)
    {
        while (low <= high)
        {
            int middle = low + (high-low)/2;

            if(arr[middle] == element)
            {
                return middle;
            }
            else if(arr[middle] > element)
            {
                high = middle - 1;
            }
            else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
