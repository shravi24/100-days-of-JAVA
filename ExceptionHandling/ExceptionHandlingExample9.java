/*Steps to create a Userdefined Exception and passing the message to it :
 * 1. Create a class that extends Exception
 * 2. Define constructor inside the class
 * 3. Use super method to call the constructor of super class and return the message.
 */


package ExceptionHandling;

public class ExceptionHandlingExample9 
{

	public static void main(String[] args)
	{
		//System.out.println("Enter the value for i and j");
		
		int i =8;
		int j=9;
		int k =0;
		
		try
		{
			 k = i/j;
			 
			 /*
			  * Here k value is not zero still we can print error written 
			  * catch block.Means we can define user defined exception using 
			  *  throw new Exception 
			  *  
			  *  Here you also can defined userdefinedException like 
			  *  throw new TelException
			  *  For this you have to create a class TelException that extends
			  *  Exception class.
			  *  
			  */
  		 if(k==0)
			 {
				throw new TelException("This is not possible ");  //Throwing our own exception
			 }

		}
		catch(TelException e)   //accepting our own exception
		{
			//e.printStackTrace();
			System.out.println("error "+ e.getMessage());
			//System.out.println(e.getMessage());
		}

		System.out.println(k);
	}

}
