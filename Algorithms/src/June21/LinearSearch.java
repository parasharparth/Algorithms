package June21;

public class LinearSearch {

    public static void main(String args[])
    {
        int[] arr = {1,3,4,5,2,7,6,9};
        int result = linearSearch(arr,5);

        if(result == -1)
        {
            System.out.println("The element is not present in the given array");
        }
        else
        {
            System.out.println("The element is present at position: "+result);
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
