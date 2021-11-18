package InterfaceExample;

/* Types of Interface
 * 1. Normal Interface : If interface has more than one method then it Normal Interface.
 * 2. Single abstract method Interface : If interface has only one method then is is call as SAM.
 * 3. Marker Interface : If interface does not have any methods, then it is called Marker Interface.
 *    for eg Serializable interface (in built one) does not have any methods.
 * 
 * Till 1.7 we had above three interfaces.
 * In 1.8 and afterwards, Single abstract  method is called Functional Interface.
 * JAVA 1.8 afterwards, types of interface will be :
 * 1. Normal 
 * 2. Functional : It has only one method. -->Using Functional Interface, Lambda expression can be built. 
 * 3. Marker
*/

/*This annotation can be used just to make sure that you define only one method in interface.
If you define more than one method in Functional, due to this annotation you will be notified at the 
compile time only because you will get compile time error. It's always better to rectify compile time error instead of
logical error.*/

@FunctionalInterface         
interface xyz
{
	void show();
	//void display();       //Error as we already declared one method. Functional interface can contain only one method
}
public class LambdaExpressionExample 
{

	public static void main(String[] args) 
	{
		
		//Using anonymous class, I override the show method.
		
		xyz obj1 = new xyz()
				{
			            public void show()
			            {
			            	System.out.println("show() method within anonymous class");
			            }
				};
				
		obj1.show();		
		
		/* In above example, in abc interface there is only method
		 * then here no need to have this much of boilerplate code. Instead 
		 * we can make use Lambda expression.
		*/
		
		System.out.println("----------------------------------------------");
		
	   //Implementing Lambda Expression
				
		/* Lambda expression can be implemented only with Functional Interface 
		 * because if its not a functional interface and have more than one method 
		 * then there will be confusion about to which method statements writtten using Lambda expression belongs . */
		xyz obj2 = () ->System.out.println("show() method by implementing lambda expression ");
			            
		obj2.show();
		
		
		

	}

}
