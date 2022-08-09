package August07.sorting;

import july07.utils.Utils;

public class CountingSort {

    public static void main(String[] args) {
        Utils.printArray(Utils.getArray(), 2);
        Utils.printArray(countingSort(Utils.getArray()), 3);
    }

    public static int[] countingSort(int[] arr) {
        //The first step is to find out the maximum element
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //The second step is to declare the count array
        int[] count = new int[max + 1];
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //The third step is to calculate the cumulative sum
        for (int i = 1; i < arr.length; i++) {
            count[i] += count[i - 1];
        }

        //The fourth step is to find the output
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        return output;
    }
}