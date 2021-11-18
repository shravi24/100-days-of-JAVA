package OOPConcepts;
class A
{
	public A()
	{
	
		System.out.println("Class A default no args Constructor");
	}
	public A(int n1)
	{
		
		System.out.println("Class A Parameterized Constructor");
	}
}

class B extends A
{
	public B()
	{
		//Every constructor will contain super() method by default.This super() will be givene by compiler.
		//super();//hidden    //will call super class no args default constructor.
		
 		super(6);
		System.out.println("Class B default no args Constructor");
	}
	public B(int p1)
	{
		//super();//hidden
		
		super(p1);
		System.out.println("Class B Parameterized Constructor");
	}
}


public class SuperKeywordExample 
{

	public static void main(String[] args) 
	{
	
		//In belwo example, this will call the default constructor of parent class first and then child class default constructor
		B obj1 = new B(); //creation of object of child class
		
		//This is because super() is the first statment in every constructor
		//super() calling constructor of super class or parent class 
		
		System.out.println("--------------------------------------------------------------");
	
		B obj2 = new B(5);     //This will call default constrt of super class and parameterized of subclass.
	
		//I want to call Parameterized Constructor of super and sub
		//as we know super() is hidden .Mention it in child class parameterized constructor and then pass the argument.
		
		System.out.println("--------------------------------------------------------------");
		
		//I want to call default constructor from class B and parameterized from class A 
		B obj3 = new B();
		
	}

}
