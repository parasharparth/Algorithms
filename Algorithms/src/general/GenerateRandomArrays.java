package general;

import java.util.Random;

import util.DisplayArray;

public class GenerateRandomArrays {

	public static void main(String args[])
	{
		int[] arr = new Random().ints(10,10,10000).toArray();
		
		DisplayArray.result(arr);
		DisplayArray.result(arr);
	}
}
