package June24;

public class LinearSearch {

    public static void main(String args[])
    {
        int[] arr = InputArray.input();
        System.out.println("The input array is: ");
        PrintArray.printArray(arr);

        int result = linearSearch(arr,5);
        if(result == -1)
        {
            System.out.println("Element not found in the given array");
        }
        else {
            System.out.println("Element found at position: "+result);
        }
    }

    public static int linearSearch(int[] arr, int element)
    {
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] == element)
            {
                return i;
            }
        }
        return -1;
    }
}
