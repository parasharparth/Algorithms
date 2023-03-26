package CY2023.March.Mar25.sorting;

public class SelectionSort {

	public static void main(String[] args){
		int[] arr = new int[]{1,3,4,2,5,8,7,6};
		selectionSort(arr);
		for (int j =0; j < arr.length; j++) System.out.print(arr[j] + " ");
		System.out.println();
	}

	public static int[] selectionSort(int[] arr){
		for(int i=0; i<arr.length; i++){
			int minimum_index = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[j] < arr[minimum_index]){
					minimum_index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minimum_index];
			arr[minimum_index] = temp;
		}
		return arr;
	}
}
