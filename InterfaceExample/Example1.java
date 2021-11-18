package InterfaceExample;

abstract class Writer
{
	 public abstract void write();
}
class Pencil extends Writer
{
	public void write() 
	{
		System.out.println("I am pencil");
	}

}

class Pen extends Writer
{
	public void write() 
	{
		System.out.println("I am pen");
	}

}

class Kit
{
	public void dosomething(Writer p)        //Passing object of Pen class as an formal parameter
	{
		p.write();
	}
}

public class Example1
{

	public static void main(String[] args)
	{
	     Kit obj1 = new Kit();
	     
	     Pencil obj2 = new Pencil();          //Creation of object of Pen class
	     obj1.dosomething(obj2);			  //Passing object reference of Pen class as argument
	     
	     //Now I am trying to to call the dosomething by passing an object of Pen
	     Pen obj3 = new Pen();
	     //obj3.dosomething(obj3);      //Error if you have not any method that takes object of class Pen
	     
	 
	     System.out.println("********************");
	     
	     /*first Solution for this :
	      *1.  Created a writer class 
	      *2.  Pen and Pencil will extend the writer class.
	      *3.  Writer class will have same abstract write method.
	      *4.  Pen and Pencil will override this write method and provide the definition.
	      *5.  In main method, refernce of super class that is writer is created and object is created 
	      *6.  For pen and pencil & these object references while calling dosomething method of Kit class.
	      *7.  Within Kit class in dosomething method, catch argument by passing a format parameter which is 
	      *    object reference of Writer class.Object reference because we cannot create an object of abstract class
	      *    But we can create reference of abstract class.
	      */

           Writer ob1 = new Pen();
           Writer ob2 = new Pencil();
           
           obj1.dosomething(ob1);                  //calls the write method of Pen class
           obj1.dosomething(ob2);				   //calls the write method of Pencil class
           
			/*
			 * But in future for example Pen want to extend the another class but curently
			 * it is extending Writer now If it extends one more class then it would be
			 * multiple inheritance. And Java does not support multiple inheritance directly
			 * Instead of making Writer class abstract we can make it an interface
			 */
	
	}
	
}