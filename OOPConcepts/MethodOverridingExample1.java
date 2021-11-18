
//Method Overriding in java : Overriding a super class method by subclass
//Run time Polymorphism

package OOPConcepts;
class A1
{
	int y;
	public void show()
	{
		System.out.println("In class A method show()");
	}
}

class B1 extends A1
{
	
//	public void show1()
//	{
//		System.out.println("In class B method show()");
//	}
	int y;
	@Override               //If you do any miistake while overriding method, this will give compile time error instead of logical error.
	public void show()
	{
		super.y=10;          //assigning the value to y varaible in suoer class
		System.out.println(y+" " +super.y); //You can also access the super class variable y using super keywprd
		super.show();        //You can call the method of parent using super keyword
		super.show();
		System.out.println("In class B method show()");
		
	}
}

public class MethodOverridingExample1 
{

	public static void main(String[] args) 
	{
	
		
		A1 obj1 = new A1();
		obj1.show();
		System.out.println("-------------------------");
		
		
		B1 obj2 = new B1();
		//If show() method does not exist in subclass this will call super class show() method.
		obj2.show();         //If method exists in subclass it will call that method because you have created object of subclass.
		
		//Suppose I also want to call the show() method in super class then super.show() can be used in subclass show() method to call the show() method in superclass.
 		
		
		System.out.println("-------------------------");
		

	}

}
