package Jun20;

public class LinearSearch {

    public static void main(String[] args)
    {
        int[] arr = {1,9,2,7,3,4,6,5,0};
        int result = linearSearch(arr,4);
        if(result == -1)
        {
            System.out.println("Element not found in the array");
        }
        else
        {
            System.out.println("Element found at position: "+result);
        }
    }

    public static int linearSearch(int[] arr, int element)
    {
        for(int i=0; i<arr.length-1;i++)
        {
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}
