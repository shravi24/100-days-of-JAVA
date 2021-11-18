
//Dynamic Method Dispatch 
/*
*Super class reference obj1 is used to refer different subclass object.This is known as Upcasting
*Here show() method is  defined in super class A3 and again this method is defined in subclasses.This is Method Overriding
*Upcasting method is used to resolve the calls to overridden methods at runtime.
*Means it tells deciding which version of overridden method will be executed.
*/

/*
 * RunTime Polymorphism : When we override the method of parent class in subclasses, we can also
 * implement runtime polymorphism.It means that which overridden method is to be executed will be
 * decided at run time depending upon the type of object being referred to by super class refernce variable
 * 
 * 
 */
package OOPConcepts;
class A3
{
	public void show()
	{
		System.out.println("In class A3 method show()");
	}
}

class B3 extends A3
{
	@Override              
	public void show()
	{
		System.out.println("In class B3 method show()");
		
	}
}

class C1 extends A3
{
	@Override
	public void show()
	{
		System.out.println("In class C1 method show()");
	}
}

public class PolymorphismExample1 
{

	public static void main(String[] args) 
	{
		  //Runtime polymorphism  :Linking object reference and object at runtime not at compile time 
	       A3 obj1 = new A3();  //Decide which method to call at runtime only.
	       
	       obj1.show();
	       
	       //Dynamic method Dispatch
	       
	       obj1 = new B3();
	       obj1.show();         //Decide which method to call at runtime only.

	       obj1 = new C1();     //Using object reference of A3(superclass), created an object of C1 subclass
	       obj1.show();        //Decide which method to call at runtime only.

	       
	       
	       
		
	}

}

