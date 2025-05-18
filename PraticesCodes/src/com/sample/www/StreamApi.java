package com.sample.www;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamApi 
{

	public static void main(String[] args) 
	{
		List<Integer> namedigit = Arrays.asList(1,2,2,5);
		List<Integer> name2 = namedigit.stream().distinct().collect(Collectors.toList());
		List<Integer> name3 = namedigit.stream().filter( a-> a >2  ) .collect(Collectors.toList());
		
		List<Double> namedigitDouble = Arrays.asList(1.5,2.5,1.54,0.6);
		List<Double>  name4 = namedigitDouble.stream().filter(a-> a>2 ).collect(Collectors.toList());
		
		List<String> name = Arrays.asList("SHABEER","SAM","SAM","GOPI");
		List<String> name1 = name.stream().distinct().collect(Collectors.toList());
		
		BiConsumer<Integer,Integer> n1 = (a,b) -> System.out.println(a+b);
		n1.accept(6,7);
		///lamda function
		
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println("DOUBLE output"+name4);


	}
	public  int addmethod (int a ,int b)
	{
		return a+b;
	}
	
	

}
