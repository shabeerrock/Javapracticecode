package com.sample.www;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

	public static void main(String[] args) 
	{
		List<List<String>> nestedList = Arrays.asList( Arrays.asList("A", "B"), Arrays.asList("C", "D"), Arrays.asList("E", "F") );
		
		System.out.println(nestedList);
		
		List<String> flattenedList = nestedList.stream()
									.flatMap(List::stream) // Flattens the nested lists
									.collect(Collectors.toList());

		System.out.println(flattenedList);
		
		//Map
		List<String> words = Arrays.asList("hello", "world", "java");

        List<String> upperCaseWords = words.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        System.out.println(upperCaseWords);

	}

}
