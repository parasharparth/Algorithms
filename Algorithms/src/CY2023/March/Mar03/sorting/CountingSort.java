package CY2023.March.Mar03.sorting;

public class CountingSort {

	public static void main(String[] args){
		int[] arr = new int[]{1,3,4,2,5,8,7,6};
		countingSort(arr);
		for (int j =0; j < arr.length; j++) System.out.print(arr[j] + " ");
		System.out.println();
	}

	public static int[] countingSort(int[] arr){
		int size = arr.length;
		int max = arr[0];
		for(int i=1; i< size; i++)
			if(arr[i] > max)
				max = arr[i];
		int[] count = new int[max+1];
		int[] output = new int[size+1];
		for(int i=0; i<max; i++)
			count[i] =0;
		for(int i=0; i<size; i++)
			count[arr[i]]++;
		for(int i=1; i<=max; i++)
			count[i] += count[i-1];
		for(int i=size-1; i>=0; i--){
			output[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}
		for(int i=0; i<size; i++)
			arr[i] = output[i];
		return arr;
	}
}
