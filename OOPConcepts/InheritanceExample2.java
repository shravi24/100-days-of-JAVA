//OOP Concept: 2. MultiLevelInheritance  

//IS-A : Whenever one class extends another class  

//HAS-A : A class in which you are creating an object of another class.
//For example in class InheritanceExample2, we created an object of CalcveryAdv1
//so we have access to CalcveryAdv1 methods through object 

package OOPConcepts;
class Calculator1               //super
{
	public int add(int i,int j)
	{
		return i+j;
	}
}

class CalcAdv1 extends Calculator1  //sub-class
{
	public int sub(int i,int j)   
	{
		return i-j;
	}
}

class CalcveryAdv1 extends CalcAdv1  //sub-class
{
	public int multi(int i,int j)   
	{
		return i*j;
	}
}



public class InheritanceExample2 
{

	public static void main(String[] args) 
	{
   
		//CalcAdv1 c2 = new CalcAdv();
		
		//Instead of creating object of CalcAdv1 we are going to create an object of CalcveryAdv1 so that we can access 
		//multi from CalcAdv1 , sub from CalcAdv1 , add from Calculator1 
		
		CalcveryAdv1 c2 = new CalcveryAdv1();
		int result1 = c2.add(18, 8);
		int result2 = c2.sub(10, 8);
		int result3 = c2.multi(10, 8);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
