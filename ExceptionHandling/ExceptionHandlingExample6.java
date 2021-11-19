package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionHandlingExample6 
{

	public static void main(String[] args) throws Exception
	{

		System.out.println("Enter a number");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());   //45
		System.out.println(n);
		
		
		/*
		 * Taking string as input from user.
		 */
		System.out.println("enter a string");
		String s = br.readLine();
		System.out.println(s);
	}

}