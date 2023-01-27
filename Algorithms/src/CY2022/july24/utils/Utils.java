package CY2022.july24.utils;

public class Utils {

    public static int[] getArray()
    {
        return new int[]{0,9,8,7,6,5,4,3,2,1};
    }

    public static void printArray(int[] arr, int type)
    {
        if(type == 1)
        {
            System.out.println("The input array is: ");
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        else if(type == 2)
        {
            System.out.println("Unsorted array is: ");
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        else if(type == 3)
        {
            System.out.println("Sorted array is: ");
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        else {
            System.out.println("Type passed is wrong, Exiting............");
            System.exit(0);
        }
    }

    public static void searchResult(int result)
    {
        if(result == -1)
        {
            System.out.println("Element not found in the given array");
        }
        else {
            System.out.println("Element found at position: "+result);
        }
    }
}
