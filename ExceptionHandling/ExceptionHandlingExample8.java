package ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionHandlingExample8 
{

	public static void main(String[] args) throws Exception
	{
		int n =0;

		System.out.println("Enter a number");
			
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			
		n = Integer.parseInt(br.readLine());   
		
		}
		
		/*
		 * here finally block is just used to close the resource.
		 * Aftr java version 1.7, you dont have to mention finally
		 * you can do this using try only.
		 * You have to write parenthesis after try and in parenthesis create an object/resource of bufferedreader
		 * after use this try block itself will close the resource.
		 * 
		 */
		
	  
		/*
		 * If you want to handle the exception means after exception as well if you 
		 * want transfer the control towards the next statements, you can include catch block
		 */
//		catch(Exception e)
//	    {
//			e.printStackTrace();
//		}
		
	
		System.out.println(n);
	}

}