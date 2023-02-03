package CY2023.February.Feb03.sorting;

public class SelectionSort {
	public static void main(String[] args){
		int[] arr = new int[]{1,3,4,2,5,8,7,6};
		selectionSort(arr);
	}

	public static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
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
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] +" ");
		System.out.println();
	}
}
