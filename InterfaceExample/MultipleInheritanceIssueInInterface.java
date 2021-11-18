/*To resolve Multiple Inheritance issue in Java by using Interface

1. Proving own implementation for this method :

You can define this method in class itself so whenever you call method, it will execute method from class.
 
 OR

2. You can override the method in class and use   `interfacename.super.methodname` within that method definition 
due to which you can call the methods defined in both the interfaces.

*/


package InterfaceExample;


interface Demo1
{
	void abc();         
	default void xyz()      
	{
		System.out.println("in xyz method from interface Demo1");
	}
}


interface MyDemo
{
	default void xyz()      
	{
		System.out.println("in xyz method from interface MyDemo");
	}
	
}


class DemoImp1 implements Demo1,MyDemo
{
	public void abc()
	{
		System.out.println("In abc method");
	}

	//This is another way to to resolve the ambiguity issue in interfaces.
	
	@Override
	public void xyz() 
	{
		
		Demo1.super.xyz();
		MyDemo.super.xyz();
	}
	
	/*// This is one of the way to resolve the ambiguity issue in interfaces.
	 * 
	 * public void xyz() 
	 * { 
	 * System.out.println("in xyz method from class DemoImp1");
	 * }
	 */

}



public class MultipleInheritanceIssueInInterface 
{

	public static void main(String[] args) 
	{
		
		Demo1 obj1 = new DemoImp1();
		
		obj1.xyz();    
		
		
		obj1.abc();   
		
		
	
	}

}

