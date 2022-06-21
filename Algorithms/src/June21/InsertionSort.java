package June21;

public class InsertionSort {

    public static void main(String args[])
    {
        int[] arr = {1,6,4,2,3,8,9,0,4};
        int [] result = insertionSorting(arr);

        System.out.println("The sorted array is: -");
        for(int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static int[] insertionSorting(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
