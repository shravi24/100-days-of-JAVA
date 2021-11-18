//We dont want anyone to create an object of abstract class.
//Instead of defining  separate methods(similar to this example where previously we need to define two methods separately) , there can have one method which accepts all subclass objects
	    


package OOPConcepts;
class Printer
{
	/*
	 * public void show(Integer i) 
	 * { 
	 * System.out.println(i); 
	 * }
	 * 
	 * public void show(Double i) //You can use i because whatever i is usedcpreviously used its scope will be within that method only. This i scope also within this method only. 
	 * { 
	 * System.out.println(i); 
	 * }
	 */
	
	
	public void show(Number i)
	{
		System.out.println(i);
	}	
	
}

public class AbstractClassExample2 
{

	public static void main(String[] args) 
	{
	
		/*
		 * Printer obj = new Printer(); 
		 * obj.show(5);
		 * 
		 * obj.show(5.5); //to support this, we should have a method which takes double value, other wise you will get compile time error
		 */		
		
		//Hey but everytime, do you have to create separate method ? Is there a one class who can receive Integer,Float ,Double
		//If you check integer class extends Number class , Double class extends Number class.. So you can make use of Number class so that no need to create separate methods for public void show(Integer i)
		
		//Number is an abstract class Why Number an abstract class ? Here we are not creating an object of Number class Number class does not have its own implementation , Classes Integer,Float are extending Number class 
		//And these classes are proving the definition or implementation for receving integer,float double ...values.
		
		Printer obj1 = new Printer();
		obj1.show(5);
		obj1.show(5.5);
		obj1.show(10000.007);
		obj1.show(5.58f);
		
		
	
	
	}

}
