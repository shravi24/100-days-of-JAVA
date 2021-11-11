package basics;

class Calci
{
	//Variables
	int num1;         
	int num2;
	int result;
	
	//Methods
	public void perform()      //Public :access specifier.Anyone can access. Void : Return type.
	{
		result = num1 + num2;
	}
	
}




public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
	Calci obj;    //Reference  
    obj = new Calci();    //obj is just a reference .With the help of NEW keyword, memory is allocated.Constructor defines how much memory is going to need.
*/	
	
		
		//Object knows something(variables) and does something(methods).
		
		Calci obj = new Calci();   //Calci (class) is a blueprint and obj is object /instance of the class.
		
		obj.num1 =3;// Whenever you want to access the variables declared inside the class then you have to access them with the help of object.
		obj.num2=5;
	
		// System.out.println(obj.result);   //Without calling to method if you access res variable then you will get value = 0. This is different in C programming where you will get garnage value if the value is not assigned. 
		
		obj.perform();   //calling to method inside the class using object reference.
		System.out.println(obj.result);  //accessing the result after calling
	
	}
}
