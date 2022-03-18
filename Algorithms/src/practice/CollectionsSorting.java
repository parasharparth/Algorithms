package practice;

import java.util.*;
import java.util.stream.Collectors;
public class CollectionsSorting {

	public static void main(String args[])
	{
		int[] arr = InputArray.input();
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		Collections.sort(list);
		list.stream().forEach(System.out::println);
	}
}
