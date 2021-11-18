package objectorientedprogramming;

class Construct_Example{
	//Variables
	int num1;
	int num2;
	int res;
	
	//Constructor will have same name as class name.
	//Define constructor to set the default values.
    //This constructor will get called automatically when you create an object.
	public Construct_Example()   //constructor does not return. so no return type.
	{
		System.out.println("Values set by construtor with no arguments");
		num1 =5;
		num2 =5;
		//System.out.println(num1+ " " + num2);
	}
	
	/*
	We can have two construtors in same class but signature should be different.
	Means you have already defined calci constructor with no argument
	If you try to define it again, it will give an error.
	*/
	
	//public Construct_Example() //duplicate constructor is not allowed.

	public Construct_Example(int n) //Constructor with one parameter
	{
		num1 = n;
		num2 = n;
		
	}
	
	public Construct_Example(float f1,int f2)
	{
		System.out.println(f1+" "+f2);
	}
	
}

public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
	    Calling default constructor with no argument
	    */
		
	   // Construct_Example t1 = new Construct_Example();  //constructor It just allocates memory
	
		/*
		 * Printing default value without initializing will be zero.
		 * System.out.println(t1.num1);
		 */
		
//		System.out.println(t1.num1);
//		System.out.println(t1.num2);
//		System.out.println("********");
	
		
		/*
	    Calling constructor with one integer argument
	    */
		
//		Construct_Example t2 = new Construct_Example(100);
//		System.out.println(t2.num1+" "+t2.num2);
	
		
		/*
	    Calling constructor with one integer argument and one float argument
	    If you try to send two arguments of float type, it will give error as undefined.
	    because there is no constructor which takes two float values.In that case,
	    If you want to set values for two float arguments with the help of constructor,
	    then there should be constructor defintion which takes two float values.
	    */
		
//		Construct_Example t2 = new Construct_Example(100);
//		System.out.println(t2.num1+" "+t2.num2);
		
		/*
		 * Calling Constructor 
		 * 
		 */
	      
		Construct_Example t3 = new Construct_Example(10.7f,8);
		System.out.println(t3.num1+" "+t3.num2);
	
	
	}

}
