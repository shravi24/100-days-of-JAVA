package OOPBasics;

class Casio
{
	public void add(int i, int j)
	{
		System.out.println(i+j);
	}
	
   //Below statement will give error because we cannot have two methods having same name and same parameters	
   //public void add(int i, int j) {System.out.println(i+j);}

   //Even if you change the return type it will throw an error as duplicate method
   //public int add(int i, int j) {return(i+j);}
	
	public void add(int i, int j, int k)
	{
		System.out.println(i+j+k);
	}
	
	public void add(double i, double j)
	{
		System.out.println(i+j);
	}
	
	//This concept is called Method Overloading.
	//You can have methods having same name but number and type of parameters is different.
    

}





public class MethodOverloadingExample1 {

	public static void main(String[] args) {
	
		Casio c1 = new Casio();
		
		c1.add(2, 2);
		
		c1.add(2, 3 ,6);
		
		c1.add(2.7, 4.5);
		
		
	}

}
