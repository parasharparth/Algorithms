package CY2023.February.Feb03.sorting;

public class RadixSort {
	public static void main(String[] args){
		int[] arr = new int[]{1,3,4,2,5,8,7,6};
		int max = arr[0];
		for(int i=1; i<arr.length; i++)
			if(arr[i] > max)
				max = arr[i];
		for(int place = 1; max/place>0 ; place*=10)
			countingSort(arr,place,arr.length, max);
		for (int j =0; j < arr.length; j++) System.out.print(arr[j] + " ");
		System.out.println();
	}

	public static void countingSort(int[] arr, int place, int size ,int max){
		int[] output = new int[size+1];
		int[] count = new int[max+1];
		for(int i=0; i<max; ++i) count[i] = 0;
		for(int i=0; i<size; i++) count[(arr[i]/place)%10]++;
		for(int i=1; i<=max; i++) count[i] += count[i-1];
		for(int i=0; i<size; i++){
			output[count[(arr[i]/place)%10]-1] = arr[i];
			count[(arr[i]/place)%10]--;
		}
		for(int i=0; i<size; i++) arr[i] = output[i];
	}
}
