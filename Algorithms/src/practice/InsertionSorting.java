package practice;

public class InsertionSorting {

	public static void main(String args[])
	{
				DisplayArray.result(insertionSort(InputArray.input()));
	}
	
	public static int[] insertionSort(int[] arr)
	{
		//Now, here we have to take the array and make new positions
		for(int i=1;i<arr.length-1;++i)
		{
			int j=i-1;
			int key = arr[i];
			
			//Now, we have to check the elements which are behind the current element, represented by i
			// and create the space required for insertion 
			while(j>=0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j=j-1;
			}
			arr[j+1] = key;
		}
		return arr;
	}
}
