package CY2022.july02.Searching;

public class LinearSearch {

    public static void main(String args[])
    {
        //the first step is to get the input array
        int[] arr = {1,9,8,3,4,6,5,2,7,0};

        //The second step is to call the linear search function
        int result = linearSearch(arr,5);
        if(result == -1)
        {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at position: "+result);
        }
    }

    public static int linearSearch(int[] arr,int element)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == element)
            {
                return i;
            }
        }
        return -1;
    }
}
