/* 
 * Simple Calci
 *  
 * 1st step : Create a class called Example1_Class_Object in which main method is written.
 * 2nd step : Create another class Calci which is outside of class Example1_Class_Object where main() is defined.
 * 3rd step : Declare variables such as num1 and num2 for two numbers & res for storing the result and one method called perform() for performing the addition inside the class called Calci.
 * 4th step : Create an object of class calci inside the main method in Example1_Class_Object class.
 * 5th step : Using object of class , initialize num1=8 and num1=9.
 * 6th step : Call the method perform to perform the addition.
 * 7th step : Print the result in main method. Make use of object reference, to print the result stored in res variable inside the class calci
 * 
 *   Simple structure will be :
 *   
 *   class class2_name
 *   {
 *   //variables
 *   
 *   //methods
 *   
 *   
 *   }
 *   public class class1_name
 *   {
 *   public static void main(String args[])
 *   {
 *   
 *   //object creation of class2_name
 *   //set the class variables
 *   //invoke the method
 *   
 *   }
 *   }
 */


package objectorientedprogramming;

/*
 * you can't put two public classes in single java file because the compiler wouldn't be able to handle that correctly.
 * so calci class cannot be public because there is one more public class 
 */

class Calci{
	//Variables
	int num1;
	int num2;
	int res;
	
	/* Whatever variables you require in the method as well you have to first declare it outside the method.*/

	//Method
	public void perform() {
		 
	 // int res = num1 + num2 ;    //if you redeclare res as int inside the method , you will get its value equal to zero.
		
	 res = num1 + num2 ;
		}
	}

public class Example1_Class_Object{
	public static void main(String args [])
	{
		Calci t1 = new Calci();   //Creation of an object of class Calci
		
		
		/*
		 * Here we have two different classes. We cannot directly access the variable/methods  of one class into another class directly.
		 * To access them, We have to create object of that class first.Using Object name we can access those variables 
		 * Or invoke those methods.
		 * 
		 */
		
		
		t1.num1 =8;               //Using object of class Calci , setting the values of variables.    
		t1.num2 =9;
		
		/*
		 * Remember here method return type is void so we cannot return. 
		 */
		
		
		/* 
		 * Here you have to call the method to perform computation.Only setting the values will not call the method. If you access this res variable without calling this method then its value will be zero in java. With respect to C++, you will get garbage value.So First You have to call method by using instance or object of that class.Then
		 * access the res variable
		 */

		
		t1.perform();			  //Using object of class Calci ,call the method. 
	
	 System.out.println(t1.res);
	}
}


