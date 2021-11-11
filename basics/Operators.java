package basics;
/* 
 * Arithmetic  + , - , * , / , %
 * Bitwise
 * Relational
 * Logical
 * 
 */
public class Operators {
	public static void main(String args [])
	{
		/*
		 
		// Arithmetic Operators 
		  
		int m=6 , n=4;
		int r1 = m+n;     //10
		int r2 = m-n;    //2
		int r3 = m*n;    //24
		
		// int r4 = m/n;    //Here we got 1 but I need whole answer along wit fraction 
		// double r4 = m/n;   //This will also give 1 as output 
		//By default division operators gives you result in integer . You have to cast it in double to get result with fraction value.
		double  r4  = (double) m/n;   // This will give correct output as 1.5 that is along with fraction. 
		
		
		//If you want only remainder part then use Modulo division Operator.
		int r5 = m%n;    //0
		
		System.out.println("Addition is " +r1);
		System.out.println("Subtraction is " +r2);
		System.out.println("Multiplication is " +r3);
		System.out.println("Division is " +r4);
		System.out.println("Modulo Division is " +r5);
		
		
		
		
		//Use of Short-Hand Operators
		
		int p=9 , q=5;
	    // q = q+p;
	    // System.out.println(q);  
	    
	    //When there is repetition of operands you can make use of short-hand Operator like this 
	    
		//q +=p;   //q=q+p
		//System.out.println(q);
	     
		q += 3; //Adding 3 to q  q=q+3
		System.out.println(q);
		*/
		
		
		//Increment - Decrement Operators 
	    // int y = 7;
	  
	    // int z = y++;        //Post-Increment  
	    
	    
	    /* 
	     * Post-Increment : will first assign the value and then increment.
	     * So here first the value of y is assigned to z . So z =7 
	     * Value of y is incremented in memory so if you print it it will give value as 8
	     * 
	   
	    
	    System.out.println(z);  //7
		System.out.println(y);  //8
		 */
		
		//---------------------------------------------------------
		
	    int n = 10;
		  
	    int m = ++n;        //Pre-Increment  
	    
	    /* 
	     * Pre-Increment : will first increment the value and then assign.
	     * So here first the value of n is incremented and then assigned to m
	     * so n=11 and m=11
	     * 
	    */
	    
	   // System.out.println(m);  //11
		// System.out.println(n);  //11
		
		
	
		int y = 7;
		  
	     y = y++;       //Post-Increment  
	     int z= y; 
		
	     //int z =y++;
	    
	     //System.out.println(z);
	     //System.out.println(y);
		
		int u = 8;
		//u = u+1;  //9
		//u += 1;   //9
		
		u++;      // u =u+1 u +=1
		System.out.println(u);
		
		
		int t =9;
		
		int e = t--;  //Post-Decrement 9
		System.out.println(e);
		
		int t1=9;
		int e1 = --t1; //Pre-Decrement 8
		System.out.println(e1);
		
		
		
		
		
		
	}

}
