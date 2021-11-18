/*
 * Anonymous class :

 * When to use ?
 * In the scenario, where only purpose to create a separate class is to override the method,
 * then in this case you can create an anonymous class.
 * 
 * How to create ?
 * Create an object of class and just before semicolon provide implementation for the class.
 * 
 * Scope of this class is within the open and close curly brackets.
 * so if intention to create a class for one time use means you are not going to reuse the method definition again
 *  then make use of anonymous classes.
 * 
*/

package InterfaceExample;

class A
{
	public void show()
	{
		System.out.println("In A show");
	}
}
//class B extends A
//{
//	public void show()
//	{
//		System.out.println("I am the best");
//	}
//	
//}





public class AnonymousInnerClassExample 
{

	public static void main(String[] args) 
	
	{
//		A obj1 = new A();
//		obj1.show();
		
		/*
		 * To invoke show method from class A. We created an object of class A Using the
		 * object, we called the method.
		 * Suppose I want to print I am the best when I invoke the show method
		 * But I dont want to change the existing method written in  Class A
		 * then We have to make another class which extends class A and then 
		 * we need to override the method show() and call this method using object class B
		 * So here only purpose of class B is used to override the method of class A
		 * In the scenario where the only purpose of class is to override the method then
		 * We dont need to create a class instead we can define that method while creating an object reference.
		 */
		
//		A obj2 = new B();
//		obj2.show();

		A obj3 = new A() {
	                   
			                   public void show() 
			                 {
				                 System.out.println("I am the best");
			                 }

		                 };
			
		obj3.show();
	}}
