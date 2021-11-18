//OOP Concept: 1. SingleLevelInheritance  
package OOPConcepts;

class Calculator         //super,parent,base class
{
	public int add(int i,int j)
	{
		return i+j;
	}
}

//class CalcAdv
//{
//	public int add(int i,int j)       // we repeating the code here.This is redundancy.
//	{
//		return i+j;
//	}
//	public int sub(int i,int j)
//	{
//		return i-j;
//	}
//}


//In this extends keyword is used to implement inhertance
//Due to which we can now fetch the feature (addition in this example ) from class Calculator.

//Calculator is called as Parent Class/superclas whereas CalcAdv is child class/subclass
//In this example, superclass will have one method called as add 
//And subclass will have two methods its own method sub  and add method from super class.

class CalcAdv extends Calculator  //sub,child,derived class
{
	public int sub(int i,int j)   
	{
		return i-j;
	}
}




public class InheritanceExample1 
{

	public static void main(String[] args) 
	{
       //Calculator c1 = new Calculator();
       //int result1 = c1.add(5, 8);
       //System.out.println(result1);
	
		//Here creating an object of child class.
		//child class has two methods sub its own method and add from parent 
		
		CalcAdv c2 = new CalcAdv();
		int result1 = c2.add(100, 8);
		int result2 = c2.sub(10, 8);
		System.out.println(result1);
		System.out.println(result2);
	}

}
