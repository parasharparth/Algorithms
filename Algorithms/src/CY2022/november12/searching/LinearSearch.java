package CY2022.november12.searching;

public class LinearSearch {

    public static int linearSearch(int[] arr, int element)
    {
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] == element)
            {
                return i;
            }
        }
        return -1;
    }
}
