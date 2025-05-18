package com.sample.www;

import java.util.function.Predicate;

public class PredicateFunction {

	public static void main(String[] args) 
	{
      PredicateFunction  predicate = new PredicateFunction();
       //predicate.testStringLength("SHAB");
      System.out.println(" check the value in predicate return : "+ predicate.testStringLength("SHABEER"));
      
      //1)function interface find the greatest number 
      Predicate<String> checkstring = s-> s.length() > 5;
      System.out.println(" in predicate fuction "+ checkstring.test("SHAB"));
      
      //2)check the number is postive are negative 
      Predicate<Integer> checkNumber =  n -> n > 0; 
      int number = -11;
      String checkValue = (checkNumber.test(number)) ? "POSTIVE" : "NEGATIVE";
      System.out.println(" given "+number+" value is postive OR Negative ANSWER : "+checkValue);
      
      //3)Check if a string is empty
      
      Predicate<String> checkStringEmpty = CSE -> CSE.equals("");
      String name = "";
      String nameResult = ( checkStringEmpty.test(name))? "IS EMPTY" : "IS NOT EMPTY" ; 
      System.out.println(" the given String is : "+nameResult);
      
      //4)Check if a number is even
      Predicate<Integer> evenNumber = en -> en%2==0;
      int evenNumberValue = 3 ;
      String evenNumberResult = ( evenNumber.test(evenNumberValue))? " is even " : "  not even" ;
      System.out.println(" the given number "+evenNumberValue+" : "+evenNumberResult);
      
      //5)Check if a string starts with a capital letter
      Predicate<String> checkFirstLetter = fl-> Character.isUpperCase(fl.charAt(0));
      String letterValue =  "shabeer";
      String checkFirstLetterValue = ( checkFirstLetter.test(letterValue))? " IS Uppercase"  : " is not in upper case" ;
      System.out.println("the value given for the first letter  ::"+checkFirstLetterValue);

      //6)Use Predicate in a method
      //Predicate<Integer> greaterthan100 
      Predicate<Integer> gratherthan100 = x-> x > 100;
      int greathanValue = 200;
      String greathanValueResult = (checkGreather(greathanValue,gratherthan100))? " is greather " : " is not greather" ;
      System.out.println("the result greater than "+ greathanValueResult);
      
      //7 Predicate Join 
      Predicate<String> evenwords = ens -> ens.length() %2==0; 
      String nameMy = "SHABEE";
      System.out.println("the predicate join "+checkstring.and(evenwords).test(nameMy) );
      		  		
	}
	
   public boolean testStringLength(String value )
   {
	   boolean  result = false ; 
	   result = (value.length()>= 5) ?  true   :  result  ;
	   return result;
   }
	
   public static boolean checkGreather (int n ,Predicate<Integer> condition ) 
   {
	 return condition.test(n);	   
   }
	

}
