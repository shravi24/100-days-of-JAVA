package com.app;

public class StudentExample
{
	/*
	 *  By default varaibles inside the class are package private. Means this variable is accessible only within package. 
	 *  To access it outside the package, make it public
	 */
	public int rollno=8;  
     
	/* If some variable is made as private, it cannot be accessed from the another class within the package and 
	 * outside the package.
	 * It means that you cannot use private outside the same class.
	*/
	private String name = "hey";
	
	
	/*
	 *  If the variable is made as protected, it can be accessed by another class within the same package.
	 *  Not accessible  outside the package 
	 */
	protected int marks = 56;
	
	
	
	int age =27;
	
}




