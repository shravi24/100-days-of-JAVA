/*
 * 1. If you define one class as abstract, then it is not necessary to have abstract methods. 
 *    It may or may not have abstract methods.
 * 
 * 2. But if you define abstract method within one class then that class should be abstract
 * 
 *  Why to use abstract class?
 *  If you dont want to have object of particular class directly.
 *  You will make that class abstract.Someone will extend this class and then create an object of it.
 *  If you dont want to provide the implemetation or if you dont want to define the method then,
 *  you can make that method as abstract otherwise you will get compile time error.
 * 
*/



package OOPConcepts;


abstract class Human
{
//	public void eat()
//	{}
	
	abstract public void eat();
	
	public void walk()
    {

    }
}

class Woman extends Human
{
	public void eat()
	{
		
	}
}


public class AbstractClassExample1 
{

	public static void main(String[] args)
	{
		
		//Human obj1 = new Human(); //error : cannot create an object of abstract class.
		
		Human obj1 = new Woman();  //creating an object of Woman which is extending Human class
	}

}
