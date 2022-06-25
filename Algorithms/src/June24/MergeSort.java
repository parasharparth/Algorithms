package June24;

public class MergeSort {
    public static void main(String args[])
    {
        System.out.println("the unsorted array is: ");
        int[] arr = InputArray.input();
        PrintArray.printArray(arr);
        System.out.println();
        System.out.println("the sorted array is: ");
        int[] result = mergeSort(arr, 0, arr.length-1);
        PrintArray.printArray(result);
    }
    public static int[] mergeSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int middle = low + (high-low)/2;
            mergeSort(arr,low,middle);
            mergeSort(arr,middle+1, high);
            merge(arr,low,middle,high);
        }
        return arr;
    }
    public static void merge(int[] arr, int low, int middle, int high)
    {
        //The first step is to calculate the length of arrays
        int length1 = middle - low + 1;
        int length2 = high-middle;
        //The second step is to make the new arrays
        int[] arr2 = new int[length1];
        int[] arr3 = new int[length2];
        for(int i=0; i<length1; ++i)
        {
            arr2[i] = arr[low+i];
        }
        for(int j=0; j<length2;++j)
        {
            arr3[j] = arr[middle+1+j];
        }
        //the third step is to check whether no array is finished and after checking
        //checking the values among themselves, put it into the main array
        int i=0;
        int j=0;
        int k = low;
        while(i<length1 && j<length2)
        {
            if(arr2[i] < arr3[j])   //change of this sign determines which way sorting will be done.
            {
                arr[k] = arr2[i];
                i++;
            }
            else
            {
                arr[k] = arr3[j];
                j++;
            }
            k++;
        }
        //the fourth step is after the third step is finished and any one array is empty,
        //then put the remaining in the normal array to achieve the required result.
        while(i<length1)
        {
            arr[k] = arr2[i];
            i++;
            k++;
        }
        while(j<length2)
        {
            arr[k] = arr3[j];
            j++;
            k++;
        }
    }
}
