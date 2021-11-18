package InterfaceExample;

/*Is Demo a functional interface ?
YES, for functional interface, the rule is to have only one abstract method. 
And here one is abstract and one is default. So yes its a functional interface. 
You can have any number of default methods in Functional interface 
but abstract method should only be one.*/


interface Demo
{
	void abc();         //declare the method
	
	// With Java 1.8 we can define the methods in interface.
	
	default void xyz()      //You have to use default when you define the method interface
	{
		System.out.println("in xyz method from Demo");
	}
}

class DemoImp implements Demo
{
	public void abc()
	{
		System.out.println("In abc method");
	}
	
	public void xyz()
	{
		System.out.println("in xyz from DemoImp");
	}
}
public class DefaultmethodIInterfaceExample 
{

	public static void main(String[] args) 
	{
		//Reference of interface and object of class that implements interface 
		Demo obj1 = new DemoImp();
		
		obj1.xyz();    //calling xyz method defined interface if not overidden by class that implements interface.
		
		/*
		 * Default method defined in interface can be override by class
		 * that implements it.so here xyz method is overriden by DemoImp
		 * class so when you invoke the method, it will call the method
		 * from class DemoImp not from method defined in interface because 
		 * object is of DemoImp.
		 * 
		 * If xyz method is not overriden by Class DemoImp then it will 
		 * call the method that is defined in interface.
		 * 
		 */
		obj1.abc();    //calling abc method declared in interface and defined in class DemoImp by implementing interface.
		
		//Remember : Default method will also come under DemoImp similar to like inheritance.
		
		
		//Object reference and object of class that implements interface
		DemoImp d1 = new DemoImp();
		
		d1.abc();
		d1.xyz();
		

	}

}
