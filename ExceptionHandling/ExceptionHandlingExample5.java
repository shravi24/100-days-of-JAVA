package ExceptionHandling;

public class ExceptionHandlingExample5 
{

	public static void main(String[] args) 
	{
		
		
		try 
		{
			int p1[] = null;
			p1[4]=9;  //Throws nullpointer exception
			
			/*
			 * Above statement throws exception so it will not go towards next statements.
			 */
			
			int a[] = new int[6];
			a[6] =90;   //Throws exception as you are trying to access the array element which is not there. Array size is 6 means array elemenst will be stored from index 0 to 5.
			int i = 7;
			int j = 0;

			int k = i / j;
			System.out.println("The output is :" + k);
		}
		
		
		catch (ArithmeticException y)
		{
			//y.printStackTrace();
			System.out.println("Cannot divide by zero");
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound");
			//e.printStackTrace();
		}
		
		/*
		 * It's always better to mention catch block which accepts object of Exception
		 * as for any numbers of exceptions if we dont include specific catch block (for
		 * eg ArrayIndexOutOfBoundsException or ArithmeticException) it can be catched
		 * in this exception block. In current example, if you place this catch block
		 * before the other two, you will get the compile time error as this exception
		 * object can handle any arithmetic and arrayindexoutofbound as well, so there
		 * is no point in mentioning them separately. So Always keep this catch block at
		 * the end.
		 *
		 */
		
		catch(Exception e)
		{
			System.out.println("Exception");
		}
	
		
		finally 
		{
			System.out.println("Heyyy...");
		}

		
		

	
	}

}
