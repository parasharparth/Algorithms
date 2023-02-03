package CY2023.February.Feb03.sorting;

public class OptimizedSort {
	public static void main(String[] args){
		int[] arr = new int[]{1,3,4,2,5,8,7,6};
		optimizedSort(arr);
	}

	public static void optimizedSort(int[] arr){
		for(int i=0; i<arr.length-1; i++){
			boolean swapped = false;
			for(int j=0; j<arr.length-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped)
				break;
		}
		for(int i=0;i<arr.length; i++)
			System.out.print(arr[i] +" ");
		System.out.println();
	}
}
