package OOPBasics;

import com.app.StudentExample;        

public class AccessModifiersExample
{
	public static void main(String[] args) 
	{
		StudentExample s1 = new StudentExample();
		
		/*
		 *  By default varaibles inside the class are package private. Means this variable is accessible only within package. 
		 *  To access it outside the package, make it public
		 */
		
		s1.rollno =8;
		
		
		
		/* If some variable is made as private, it cannot be accessed from the another class within the package and 
		 * outside the package.
		 * It means that you cannot use private outside the same class.
		*/
		//s1.name="hello";  //error
		
		
		/*
		 *  If the variable is made as protected, it can be accessed by another class within the same package.
		 *  Not accessible  outside the package 
		 */
		//s1.marks =90;      //error

		
		//s1.age=30; //error because age varaible is package private
		
	}

}



