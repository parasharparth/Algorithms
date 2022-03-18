package practice;

public class SelectionSorting2 {

	public static void main(String args[])
	{	
		DisplayArray.result(selectionSort(InputArray.input()));
	}
	
	public static int[] selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
}
