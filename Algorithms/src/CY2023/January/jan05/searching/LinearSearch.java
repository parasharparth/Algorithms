package CY2023.January.jan05.searching;

public class LinearSearch {

    public static int linearSearch(int[] arr, int element)
    {
        for(int i:arr)
        {
            if(arr[i] == element)
                return i;
        }
        return -1;
    }
}
