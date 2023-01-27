package CY2022.July01.searching;

public class LinearSearch {

    public static void main(String args[])
    {
        //The first step is to get the array
        int[] arr = {1,3,2,4,7,6,5,9,0,8};

        //The second step is to call the search function
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
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == element)
            {
                return i;
            }
        }
        return -1;
    }
}
