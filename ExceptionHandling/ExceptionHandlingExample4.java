package ExceptionHandling;

public class ExceptionHandlingExample4 
{

	public static void main(String[] args) 
	{
		
		
		try 
		{
			int a[] = new int[6];
			
			a[6] =90;   //Throws exception as you are trying to access the array element which is not there. Array size is 6 means array elemenst will be stored from index 0 to 5.
			int i = 7;
			int j = 0;

			int k = i / j;
			System.out.println("The output is :" + k);
		}
	
		//Instead of writing mutiple catch block, you can catch multiple exceptions in single catch.
		//Catching multiple exceptions in single catch is introduced in Java 1.7
		
		catch(ArithmeticException  | ArrayIndexOutOfBoundsException y)
		{
			System.out.println("Error");
			
			//y.printStackTrace();
		}
		finally 
		{
			System.out.println("Heyyy...");
		}

		
		

	
	}

}