package OOPConcepts;

public class WrapperClassExample1 
{


	public static void main(String[] args) 
	{
	
		
		int i =5; //Primitive data type 
		
		//Wrapperclassname objectreferencename = new Wrapperclassname();
		Integer ii = new Integer(5);        //passing the 5 value 
		
		
		
		Integer iii = new Integer(i);   //Boxing  - Wrapping  //Putting primitive variable inside the object
		
		int j = iii.intValue(); //unboxing - unwrapping   //Taking out the value from object
		
		System.out.println(j);
		
		
		int q=10;
		
		Integer v1 = q;  //Autoboxing  //Instead of using new Integer, if we directly assign the primitive value to object reference, even if you are not mentioning new JVM will internally use new Integer. Since this is done automatically It is called as AutoBoxing 
		
	    int k = v1;     //Autounboxing  //No need to use intvalue to take out the value from object. It will assign automatically the value of v1 to k. 
	    
	    System.out.println(k);
	    
	    //Primitives work faster than Wrapper classes
	    //There are certain frameworks hibranate, collection api there we have to use wrapper class as these fameworks does not support primitive data types.
		
		
		
		
		
		
		

	}

}


