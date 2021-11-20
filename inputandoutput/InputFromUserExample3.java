/*
   Here we use Scanner class which is in java.util package to take input from user.
   For this, you have to create an object of Scanner and in this scanner make sure to pass
   object of InpuStream class. This object is created within System class.
   System.in : Indicates that you are receiving input from user.
*/


package inputandoutput;

import java.util.Scanner;

public class InputFromUserExample3 
{

	public static void main(String[] args)
	{
	   int n =0;
       System.out.println("Enter input");  //Taking input from user.
		
		
	   Scanner sc = new Scanner(System.in);
		/*
		 * Advantages of using Scanner class :
		 * 1. Don't have to handle the exception
		 * 2. Here separate methods are available for example 
		 * if you want to take integer input, you can use nextInt instead of 
		 * accepting as a string and then converting to int using parseInt which we 
		 * did when we take integer input using BufferedReader.
		 * 
		 */
		n = sc.nextInt();
		
		System.out.println(n);
	}
	

}
