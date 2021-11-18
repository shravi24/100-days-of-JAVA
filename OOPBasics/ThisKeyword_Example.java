package OOPBasics;

class Calci2
{
	//instance scope 
	int num1;
	int num2;
	int result;
	
	public Calci2(int num1, int num2)
	{
		//If you do like below and try to print those values you will get zero as ouput
		//num1 & num2 defined in instance local scope (in method) and other two are in instance scope
		//Why zero ? Because the instance value is getting assigned to instance variable. Here local variables are shadowig instance variables. Checkout the colour code to understand better 
		//We need something that can differentiate between local and instance variables 
		/*
		num1 = num1;
		num2 = num2;
		*/
		
		this.num1 = num1;  //current object
		this.num2 = num2;
		
		//Here this.num1 and this.num2 refers to intance varible.
		//so in this way we differentiated between instance and local variables.
		//so here whatever value we pass(in this case 8 and 9) while creatiing an object will get captured in 
		//Local variables num1 and num2 & assigned to instance variables having same name using this keyword.
	}
}
public class ThisKeyword_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calci2 obj1 = new Calci2(9,8);
		
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);
		
		
	}

}
