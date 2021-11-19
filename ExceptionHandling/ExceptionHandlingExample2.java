package ExceptionHandling;

public class ExceptionHandlingExample2 
{

	public static void main(String[] args)
    {
		try
			{
				int i =7;
				//int j =2; 
				
				int j=0;
				
				//int k = i/j;  //No exception when i=7 and j=2
				
				/*
				 * As soon as get the exception, it goes to catch block
				 */
				int k =i/j; //throws exception as j=0 hence will not execute the statement after this.
				System.out.println("The output is :"+k);
			}
		
		/*
		 * Instead of catching into object of Exception class.
		 * You can be more specific as you know it throws arithmetic exception .
		 * You can catch into an object of ArithmeticException
		 * ArithmeticException is a subclass of RuntimeException.
		 * RuntimeException is a subclass of Exception.
		 */
		
			catch(ArithmeticException y)  
			{
				y.printStackTrace();
			}
			
		   /*suppose you want to print something in both the conditions that is when exception occurs and when does not.
		    * Use Finally Block to execute a set of statements even if the exception occurs or not.
		    */
		
		
			finally
			{
			System.out.println("Heyyy...");  
			}
			
    }

}
