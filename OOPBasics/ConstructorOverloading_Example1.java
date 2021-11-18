package OOPBasics;

class Casio1
{
	int num1;
	int num2;
	String operation;
	
	public Casio1()  //default constrcutor with no args
	{
		num1 = 0;
		num2 = 0;
		operation = "Nothing";
		System.out.println("Constructor1");
		System.out.println(num1+" "+num2+" "+operation);
		
	}
	
	
	// public Casio1() {}   //This will give error.
	
    //You cannot have two constructors having same number of parameters.
	
	
	public Casio1(int n)   //Parameterzied Constructor
	{
		num1 = n;
		num2 = 0;
		operation = "Nothing";
		System.out.println("Constructor2");
		System.out.println(num1+" "+num2+" "+operation);
	}
	

	
	public Casio1(int n1, int n2,String op)  //Parameterzied Constructor
	{
		num1 = n1;
		num2 = n2;
		operation = op;
		
		System.out.println("Constructor3");
		System.out.println(num1+" "+num2+" "+operation);
	}
	
	/*
	 * This is called as Constrcutor Overloading 
	 * Having one more than one constructor differing in signature that is number and type of parameters
    */
	
	
	
}
public class ConstructorOverloading_Example1 {

	public static void main(String[] args) {
		
		// Casio1 c1 = new Casio1();  // this will call default no args constructor.
		
	   // Casio1 c1 = new Casio1(5);   //this will call constructor2 which takes one integer argument.
		
	  Casio1 c2 = new Casio1(5,10,"shraddha"); //this will call constructor3 which takes two integer arguments and one string argument.
		
	}

}
