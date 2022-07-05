package july03.Sorting;

public class QuickSort {

    public static void main(String[] args)
    {
        //The first step is to get the input array
        int[] arr = {0,9,8,7,6,5,4,3,2,1};

        //The second step is to print the unsorted array
        System.out.println("The unsorted array is: ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println();

        //The third step is to call the quick sort function
        quickSort(arr,0,arr.length-1);

        //The fourth step is to print the sorted array
        System.out.println("The sorted array is: ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }

    public static void quickSort(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int pivot = partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }

    public static int partition(int[] arr, int low,int high)
    {
        int pivot = arr[high];
        int i=low-1;

        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
