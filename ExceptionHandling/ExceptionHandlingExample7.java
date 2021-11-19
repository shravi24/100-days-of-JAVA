package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionHandlingExample7 
{

	public static void main(String[] args) throws Exception
	{
		int n =0;

		System.out.println("Enter a number");
		
		BufferedReader br = null;
			
		try
		{
		
		br=new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());   //45
		
		
		
		/*
		 * Any classes that comes with io are resources.
		 * So it is necessary to close them after use.
		 * Once closed, we cannot use them.
		 * so make sure to close them at the end.
		 */
		
		/*
		 * //If you got the exception in previous line control will go to catch block. 
		 * Will not close the resorce.
		 * So it is better to close the resource in finally block.
		 * finally block is executed regardless of whether the exception 
		 * occurs or not.
		 */
		
		//br.close(); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		
		finally
		{
			/*close method also throws exception.
			 * You can handle it using try catch or using throws
			 */
			br.close();   
		}
		
		System.out.println(n);
	}

}