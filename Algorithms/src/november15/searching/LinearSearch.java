package november15.searching;

public class LinearSearch {

    public static int linearSearch(int[] arr, int element)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i] == element)
            {
                return i;
            }
        }
        return -1;
    }
}
