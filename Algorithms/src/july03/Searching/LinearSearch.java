package july03.Searching;

public class LinearSearch {

    public static void main(String[] args)
    {
        //The first step is to get the input array
        int[] arr = {0,9,8,7,6,5,4,3,2,1};

        //The second step is to call the linear Search function
        int result = linearSearch(arr,1);

        //The third step is to print the result
        if(result == -1)
        {
            System.out.println("Element not found in the given array");
        }
        else {
            System.out.println("Element found in the array at position: "+result);
        }
    }

    public static int linearSearch(int[] arr,int element)
    {
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
