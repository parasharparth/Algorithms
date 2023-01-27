package CY2022.June22;

public class LinearSearch {
    public static void main(String args[])
    {
        int[] arr = {1,9,8,3,4,6,2,7,5,0};
        int result = linearSearch(arr,5);

        if(result == -1)
        {
            System.out.println("Element not found");
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
