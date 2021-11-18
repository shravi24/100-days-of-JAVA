//varargs : variable length arguments
package OOPBasics;

class Cal {
//	public int add(int i,int j)
//	{
//		return i+j;
//	}
//	
	// You can use varargs : Values that are passed will receive as an array 
	//for example : {5, 6, 7}
	public int add(int ... p) // variable length arguments : Will become an array
	{
		int sum = 0;
		for (int i : p) // for each loop to print the array
		{
			sum = sum + i;
		}
		return sum;

	}
}

public class VarargsExample1 {

	public static void main(String[] args) {
		Cal c1 = new Cal();
		System.out.println(c1.add(5, 6)); // passed two values for addition

		// Let's say I want to add 3 values at one time other time I have to add 2 , at
		// other time 4 variables

		System.out.println(c1.add(5, 6, 7));
		System.out.println(c1.add(1, 2, 3, 4, 5, 6, 7)); // values passed

	}

}
