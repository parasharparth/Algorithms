package CY2023.February.Feb03.sorting;

public class InsertionSort {
	public static void main(String[] args){
		int[] arr = new int[]{1,3,4,2,5,8,7,6};
		insertionSort(arr);
	}

	public static void insertionSort(int[] arr){
		for(int i=1; i<arr.length; i++){
			int key = arr[i];
			int j=i-1;
			while(j>=0 && key<arr[j]){
				arr[j+1] = arr[j];
				--j;
			}
			arr[j+1] = key;
		}
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
}
