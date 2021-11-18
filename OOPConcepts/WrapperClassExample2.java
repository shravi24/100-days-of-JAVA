package OOPConcepts;

public class WrapperClassExample2 
{

	public static void main(String[] args) 
	{
		String str = "123";
		
		//int n = str;  //Error : cannot assign the string value to integer
		
		
		//Convert string into integer using parseInt method.
		//parseInt is a static method so we need to call it using class name Integer.
		int n = Integer.parseInt(str);
		
		System.out.println(n);
		
		
		
		
		
	
	}

}
