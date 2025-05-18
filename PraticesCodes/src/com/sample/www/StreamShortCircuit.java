package com.sample.www;

import java.util.Arrays;
import java.util.List;

public class StreamShortCircuit {

	public static void main(String[] args) 
	{
		List<Integer> arlist = Arrays.asList(1,4,5,6,88,25);
		
	//Intermidiate short circuit
		arlist.stream().limit(2).forEach(x->System.out.println(x));
		//arlist.stream().limit(-2).forEach(x->System.out.println(x)); //IllegalArgumentException
		System.out.println("java take while ");
		//if anythink is fails then it will print or else wont for example (x>5) all will true so not output
		//if any condition is fails then print before condition
		arlist.stream().takeWhile(x->x<5).forEach(x->System.out.println(x));
		System.out.println("SKIP first 4 element ");
		arlist.stream().skip(4).forEach(x-> System.out.println(x));
		
	//terminate  short circuit
		//findFirst() -Returns the first element encountered
		List<String> arString = Arrays.asList("shabeer","shahul","shahin","Arshiya");
		System.out.println(arString.stream().filter(x-> x.contains("shah")).findFirst());
		
//		findAny()
//		Returns any element (useful in parallel streams). OPtional class will return 
		//arString.stream().filter(x->x.contains("sha")).findAny().get());
		System.out.println("#########find any()##########");
		System.out.println(arString.stream().parallel().filter(x->x.contains("sha")).findAny().get());
		
	//	anyMatch(Predicate)
	//Returns true if any element matches the predicate. Stops at the first match.
		System.out.println("#############Any match##############33");
		 System.out.println(arString.stream().anyMatch(x->x.contains("sha")));
		 
	//	allMatch(Predicate)
	//	Returns false at the first element that doesn't match.
		System.out.println("##############ALL Match#########################"); 
		List<String> ar2List = Arrays.asList("shabeer","shahul","shahin");
		System.out.println(ar2List.stream().allMatch(x->x.contains("sha") ) );
		System.out.println(ar2List.stream().allMatch(x->x.contains("New") ) );
		
	//  noneMatch(Predicate)
	// Returns false at the first matching element.
		System.out.println("######NONmatch#######");
		System.out.println( ar2List.stream().noneMatch(x->x.contains("sha")));
		System.out.println( ar2List.stream().noneMatch(x->x.contains("New")));
		
		/*
		 * anyMatch(Predicate)
Returns true if any element matches the predicate. Stops at the first match.

allMatch(Predicate)
Returns false at the first element that doesn't match.

noneMatch(Predicate)
Returns false at the first matching element.

findFirst()
Returns the first element encountered.

findAny()
Returns any element (useful in parallel streams).
		 */
		

	}

}
