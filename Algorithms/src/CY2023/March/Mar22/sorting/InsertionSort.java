package CY2023.March.Mar22.sorting;

public class InsertionSort {

	public static void main(String[] args){
		int[] arr = new int[]{1,3,4,2,5,8,7,6};
		insertionSort(arr);
		for (int j =0; j < arr.length; j++) System.out.print(arr[j] + " ");
		System.out.println();
	}

	public static int[] insertionSort(int[] arr){
		for(int i=1; i<arr.length; i++){
			int key = arr[i];
			int j=i-1;
			while(j>=0 && key<arr[j]){
				arr[j+1] = arr[j];
				--j;
			}
			arr[j+1] = key;
		}
		return arr;
	}
}
