// To find if given number is odd or even.
package basics;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *   if()
		 *      {
		 *          //No. of statements 
		 *      }
		 *  else
		 *     {
		 *         //No. of statements 
		 *     }
		 * 
		 
		 */
		
		//IF- ELSE 
		/*
	    int num=10;
		if(num%2 == 0)
		{
			System.out.println("The number is even.");
		}
		else
		{
			System.out.println("The number is odd.");
		}
		
		
		 * 
		//Syntax error on token "else".So if you have more than one statement in IF- block then include them in curly Braces
		int num1 =10;
		
		if (num1%2 == 0)
		{
            System.out.println("Hey");
		    System.out.println("My name is Shraddha");   
		}
	   else
	   {
			System.out.println("Hello");
		
	   }
		
	
		
		
		 
		 //This will not print nothing because condition is false 
		 
		if(false)
		   System.out.println("Hey there..What's up ?");
		
		
		if(false)   
			System.out.println("Bye");
		
		
		
		//Below will print Hey there..What's up ?
		//Remember this is because if block is executed only when condition is true.
		
		if(true)
			   System.out.println("Hey there..What's up ?");
			
			
			if(false)   
				System.out.println("Bye");
			
		

		
		boolean b1 = true;   //Boolean type variable b1 can only take the values true or false
		if(b1)
		{
			System.out.println("Hey Shraddha , How are you ? ");
		}
		else
		{
			System.out.println("Bye");
		}
	
		
		
		boolean b1 = false;   //Boolean type variable b1 can only take the values true or false
		if(b1)
		{
			System.out.println("Hey Shraddha , How are you ? ");
		}
		else
		{
			System.out.println("Bye");
		}
		
			
	//Ternary Operator 
	
		int i =8;
		
		int j=0;
		
		if(i>6)
			j=1;
		else
			j=2;
		

		System.out.println(j);
	

		/*
		 * 
		 * For checking value of j we are using 3-4 lines of statement
		 * This can be reduced if you use ternary Operator
		 *
		
		
		
		// condition? expr1 : expr2
	
		j= (i>6)? 1: 2;
		
		System.out.println(j);
		
	
	 		
		
		
		/*
		 * 
		 * Switch Statement
		 * 
		 * 
		 * 
		 
		
		//Take a number as input and print it in words.
		
		int num1 = 7;
		
		
		switch(num1)
		{
		case 1:
		       System.out.println("One");
		       break;
		
		case 2:
			   System.out.println("Two");
			   break;
		case 3:
		       System.out.println("Three");
		       break;
		case 4:
		       System.out.println("Four");
		       break;
		case 5:
		       System.out.println("Five");
		       break;
		case 6:
		       System.out.println("Six");
		       break;
		case 7:
		      System.out.println("Seven");
		      break;
		case 8:
		      System.out.println("Eight");
		      break;
		case 9:
		     System.out.println("Nine");
		     break;
		}
		
       
   */
		
		
		
		
		int y1 = 6;
		
		
		switch(y1)
		{
		case 1:
		       System.out.println("One");
		       break;
		
		case 2:
			   System.out.println("Two");
			   break;
		case 3:
		       System.out.println("Three");
		       break;
		case 4:
		       System.out.println("Four");
		       break;
		case 5:
		       System.out.println("Five");
		       break;
		       
		default :
			System.out.println("Invalid Choice");
		
		}
		
		
		
		
		
		
	}

}
