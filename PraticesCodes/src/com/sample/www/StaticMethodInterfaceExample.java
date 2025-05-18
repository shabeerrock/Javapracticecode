package com.sample.www;

/*
 * This default method interface and static method interface example 
 * default method can be override by parent 
 */

interface A
{
	default String showName()
	{
		return "Ahamed";
	}
	
   static String showDetail()
   {
	   return "shabeer";
   }	
}


public class StaticMethodInterfaceExample implements A 
{
	@Override
	public String showName()
	{
		//return "shahuil first this will print ";
		return A.super.showName(); //parent call the child 
	}
	
	public static void main(String[] args) 
	{
		StaticMethodInterfaceExample obj = new StaticMethodInterfaceExample();
		System.out.println(obj.showName() ); //default method calling with implement call object 
		System.out.println(A.showDetail()); // to call the static method
	}
}
