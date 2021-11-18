
//Method Overriding Example2 : Run time Polymorphism

package OOPConcepts;
class A2
{
	
	public void show()
	{
		System.out.println("In class A2 method show()");
	}
}

class B2 extends A2
{
	@Override               //If you do any mistake while overriding method, this will give compile time error instead of logical error.
	public void show()
	{
		System.out.println("In class B2 method show()");
		
	}
	
	public void config()
	{
		System.out.println("In config");
	}
}

class C extends A2
{
	public void show()
	{
		System.out.println("In class C method show()");
	}
}

public class MethodOverridingExample2
{

	public static void main(String[] args) 
	{
	
		//Reference of A2 and Object of A2
		A2 obj1 = new A2();
		obj1.show();
		System.out.println("-------------------------");
		
		//Reference of B2 and Object of B2
		B2 obj2 = new B2();
		
		obj2.show();         
		
		System.out.println("-------------------------");
		
		//obj2.config(); //we can call this method using obj2 as reference and object is of B2.
		//obj1.config();  //ERROR : because obj1 : reference and object of Class A2. config() method is not defined in class A. Hence not accessible.
		
		//Reference of A2 and Object of B2
		A2 obj3 = new B2();   
		obj3.show();        //reference of A but object/implementation is oF B2 so B2 class show method is called.
		
		 //We can create an reference Of A2 and Object of B2 because A2 is parent or superclass.
	     
				
		//Can we call the method config() using obj3? 
		
		//obj3.config();  //ERROR : because we have created reference of A. But config method is not specified in classA2
	
		
		System.out.println("-------------------------");
	    C obj4 = new C(); //Creating object of C
	    obj4.show();

	  
	}

}

