package org.example;

import java.util.function.Function;

public class FunctionInterface 
{
	public static void main(String[] args) 
	{
		// Before 1.8 we have used to creat a sperate methods
		FunctionInterface sprateMethod  = new FunctionInterface();
		System.out.println(" check in the method  "+sprateMethod.methodsqr(2)) ;
		
		// write function to square the  given data?
		Function<Integer,Integer> SquareIt =( x -> x * x );
		System.out.println(" the given value need to square the Value "+SquareIt.apply(2));
		
		//Function chaining in java  andThen Method
		Function <Integer,Integer> cubeIt = i -> i*i*i;
		System.out.println(" the given value need to cubic the Value "+cubeIt.apply(2));
		System.out.println(" using function chanining andThen "+ SquareIt.andThen(cubeIt).apply(2));
		
		//Function chaining in java  compose Method
		System.out.println(" using function chanining  Compose :"+ SquareIt.compose(cubeIt).apply(3)); // TODO need to check the video but answer is corrected  
		
		
		//need to chat GPT problem 
		
		
		

		
	}
	
	public int methodsqr(int a)
	{
		return a*a;
	}

}
