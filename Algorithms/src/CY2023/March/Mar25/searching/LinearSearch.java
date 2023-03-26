package CY2023.March.Mar25.searching;

public class LinearSearch {

	public static void main(String[] args){
		int[] arr = new int[]{1,5,4,3,6,8,2};
		int result = linearSearch(arr,2);
		if(result!= -1){
			System.out.println("Element found on position "+ result);
		}
		else
		{
			System.out.println("Element not found");
		}
	}

	public static int linearSearch(int[] arr, int element){
		for(int i=0; i<arr.length; i++){
			if(arr[i] == element){
				return i;
			}
		}
		return -1;
	}
}
