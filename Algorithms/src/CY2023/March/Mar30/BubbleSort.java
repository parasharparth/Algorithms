package CY2023.March.Mar30;

public class BubbleSort {

	public static void main(String[] args){
		int[] arr = new int[]{1,3,4,2,5,8,7,6};
		bubbleSort(arr);
		for (int j =0; j < arr.length; j++) System.out.print(arr[j] + " ");
		System.out.println();
	}

	public static int[] bubbleSort(int[] arr){
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-i-1; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
}
