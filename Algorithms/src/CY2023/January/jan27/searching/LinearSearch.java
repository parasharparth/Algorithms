package CY2023.January.jan27.searching;

public class LinearSearch {

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
