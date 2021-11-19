package ExceptionHandling;
import java.lang.System;

public class ExceptionHandlingExample1 
{

	public static void main(String[] args)
    {
		/*
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero
		*/
		
		 //int i = 9/0;     //Compiler will not notify about this exception. It will occur at runtime. 
		
		/*
		 * Below statement will not get executed if above exception is not handled.
		 */
		
		//System.out.println("Hey there");      
	
         /*
          * Handling exception with try catch
          */
    
			try
			{
				
				int i = 9/0;  //Throws object of Exception
			}
			catch(Exception y)  //accepts object of exception   
			{
				//System.out.println("Error");
				
				/*
				 * System.err is also a print stream. 
				 * It works the same as System.out. It is used to output error texts.
				 * Some IDEs like Eclipse will show the output to System.err in red text, 
				 * to make it more obvious that it is error text. 
				 */
				
				//System.err.println("Error");   
				System.out.println(y);   //You can also print the exception details
				System.out.println();
				y.printStackTrace();
			}
			
			System.out.println("Hey there");  
			
    }

}
