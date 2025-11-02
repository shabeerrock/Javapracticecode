package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/*
 * 1)peek()
 * 2)mixing of in Terminate operation
 * 3)return in terminal operation
 * 4)Reduce()
 */

public class StreamTerminalVsNonTerminal 
{

	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1,"shabeer");
		Employee e2 = new Employee(2,"sam");
		Employee e3 = new Employee(3,"gopi");
		Employee e4 = new Employee(4,"mathan");
		Employee e5 = new Employee(5,"vicky");
			
		List<Employee> arObjList =  Arrays.asList(e1,e2,e3,e4,e5);
		List<Integer>  intList   =  Arrays.asList(5,3,55,79,25);
		//More than one intermidiate operation 
		intList.stream().map(a->a+a).filter(a->a>10).forEach(a->System.out.println(a));
		System.out.println("##############count######");
		long i = intList.stream().map(a->a+a).filter(a->a>10).count();
		System.out.println(i);
		System.out.println("##############return in statement######");
		//if more than one condition check need to add the 
		arObjList.stream().filter(a-> a.getId()%2==0 ).map(a->{//a.getName();
			                                                   return a.getName(); }
		).forEach(a->System.out.println(a));
		System.out.println("##############Peek######");
		//its will execute line line process
		intList.stream().filter(a-> a>10).peek(a->System.out.println(a)).map(a->a+a).forEach(x->{System.out.println("OUTPUT");
		 																						System.out.println(x);
		 																						System.out.println("ENDLINE");});
		System.out.println("##############Reduce######");
		//0+5 =5 return 5 5+3 = return 15+55 return 70 
		int t =  intList.stream().reduce((a,b)->a+b).get() ;
		System.out.println(t);
		System.out.println("##############add sum of number in method ######");
		add(intList);
		
		
	}
	
	public static void add(List<Integer> a)
	{
		int sum =0;
		for(Integer o : a )
		{
			sum+=o;
		}
		System.out.println(sum);
		
	}

}

class Employee
{
  private int id;
  private String name;
  
  public Employee(int id, String name) 
  {
	  super();
	  this.id = id;
	  this.name = name;
  }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() 
{
	return "Employee [id=" + id + ", name=" + name + "]";
}
  
  
  
  
  

}
