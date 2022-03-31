package practice;

import java.util.Random;

public class RandomisedArray {
	
     public static int[] getRandomizedArray()
     {
    	return new Random().ints(100,10,10000).toArray();
     }
}
