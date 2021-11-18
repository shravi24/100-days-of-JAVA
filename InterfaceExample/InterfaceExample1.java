/*
   1. We can achieve multiple inheritance as we can implement multiple interfaces.
      In abstract classes we cannot extend multiple classes.
   2. All methods in an interface are public abstract by default hence you cannot define them.
   3. Given a choice, go for interface because in future if someone wants to implement your interface, then they can do it.
   4. If you dont want to define the methods then go for interfaces otherwise go for abstract classes.
   5. We cannot create an object of interface. 
      We can just create a reference of inetrface and can create an object of class that implements interface*/


package InterfaceExample;

interface Writer1
{
	// public abstract void write();
	 
	   void write();     //No need to mention public abstract. By default methods in interface will be public and abstract
}




class Pencil1 implements Writer1
{
	public void write() 
	{
		System.out.println("I am pencil");
	}

}

class Pen1 implements Writer1
{
	public void write() 
	{
		System.out.println("I am pen");
	}

}

class Kit1
{
	public void dosomething(Writer1 p)        //Passing object of Pen class as an formal parameter
	{
		p.write();
	}
}

public class InterfaceExample1
{

	public static void main(String[] args)
	{
		/*
		 * We cannot create an object of interface but we can create an reference of
		 * Interface
		 */
		
		Writer1 ref = new Pen1();

		Writer1 ref1 = new Pencil1();
		
		
		/*
		 * We will call the dosomething method of Kit1 class and will pass the Superclass refernces.
		 * Depending upon type of object for that refernce, write method will get called
		 */
		
		Kit1 k1 = new Kit1();
		
		k1.dosomething(ref);  //will call write method of Pen1 class
		
		k1.dosomething(ref1);  //will call write method of Pencil1 class
		
		
		
		
	}
	
}
