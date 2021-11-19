package inputandoutput;

public class InputFromUserExample1 
{

	public static void main(String[] args) throws Exception 
	{
		/*
		 * throws Exception is used
		 * 
		 */
		
//		System.out.println("Enter the value");
//		
		/*
		 * Default method of in is read()
		 */
//		int i = System.in.read();     //Taking input from user as a character converts it into int and stored in i
//		
//		System.out.println("Printing ascii value of character");
//		System.out.println(i);        //Printing Ascii value for that character
//		
//		/*
//		 * Typecasting to char to print actual character
//		 */
//		
//		System.out.println("Printing actual character ");
//		System.out.println((char)i);        //printing actual character
//		
//		
		
		/*
		 * Can we accept string value using read method ?
		 * No because read method returns int value.You can confirm this if you hover over this read()
		 * 
         */
		//System.out.println("enter a string");
		//String p = System.in.read();   //Error : Cannot convert from String to int
		
		
		//int s = System.in.read();
		/*
		 * 
		 * One drawback read() method is that It will take single character at a time.
		 * If you want to check, give input as Shravi, it will print s only
		 */
		
		//System.out.println((char)s); 
		
		/*
		 * To print the entire string, we have to use while and in that we have to take and save into q
		 * one by one. This while loop will take input until enter is given. Ascii value of enter key is 10.
		 * so we used it in while condition.
		 * 
		 */
		System.out.println("Enter a string");
		String str ="";
		int q;
		
		while((q =System.in.read())!=10)
		{
			str = str + (char)q;
		}
		
		System.out.println(str);
		
		/*
		 * Instead of this, it is easier to take input from user using Scanner and BufferedReader classes.
		 */
		
	}

}
