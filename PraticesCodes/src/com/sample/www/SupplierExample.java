package com.sample.www;

import java.util.Date;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample 
{

	public static void main(String[] args) 
	{
		//1) get date 
		Supplier<Date> date = ()-> new Date();
		System.out.println(date.get());
		//2) Random
		Supplier<Integer> num = () -> new Random().nextInt(99) ;
		//3) return string
		Supplier<String> name = ()->"SHABEER";
		System.out.println(name.get());
	}

}
