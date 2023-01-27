package CY2022.july10.utils;

public class Utils {

    public static int[] getArray()
    {
        int[] arr = {0,9,8,7,6,5,4,3,2,1};
        return arr;
    }

    public static void printArray(int[] arr, int type)
    {
        if(type == 1)
        {
            System.out.println("The input array is: ");
            for(int i=0; i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        else if(type == 2)
        {
            System.out.println("Unsorted array is: ");
            for(int i=0; i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        else if(type == 3)
        {
            System.out.println("Sorted array is: ");
            for(int i=0; i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        else {
            System.out.println("Type passed is wrong, Exiting............");
            System.exit(0);
        }
    }
}
