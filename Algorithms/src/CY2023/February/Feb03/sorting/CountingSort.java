package CY2023.February.Feb03.sorting;

public class CountingSort {
	public static void main(String[] args){
		int[] arr = new int[]{1,3,4,2,5,8,7,6};
		countingSort(arr);
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void countingSort(int[] arr){
		int max = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i] > max)
				max = arr[i];
		}
		int[] count = new int[max+1];
		for(int i=0; i<max; ++i)
			count[i] =0;
		for(int i=0; i<arr.length; i++)
			count[arr[i]]++;
		for(int i=1; i<=max; i++)
			count[i] += count[i-1];
		int[] output = new int[arr.length+1];
		for(int i=arr.length-1; i>=0; i--){
			output[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}
		for(int i=0; i<arr.length; i++)
			arr[i] = output[i];
	}
}
