package June24;

public class RecursiveBinarySearch {

    public static void main(String args[])
    {
        int[] arr = InputArray.input();
        PrintArray.printArray(arr);

        int result = recursiveBinarySearch(arr,5,0,arr.length);

        if(result == -1)
        {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at position: "+result);
        }
    }

    public static int recursiveBinarySearch(int[] arr, int element, int low, int high)
    {
        while(low <= high)
        {
            int middle = low  + (high-low)/2;
            if(arr[middle] == element)
            {
                return middle;
            }
            else if(arr[middle] > element)
            {
                return recursiveBinarySearch(arr,element,low,middle-1);
            }
            else {
                return recursiveBinarySearch(arr,element,middle+1,high);
            }
        }
        return -1;
    }
}
