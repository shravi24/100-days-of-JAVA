package OOPBasics;

public class JaggedArray 
{

	public static void main(String[] args) 
	{

		int d1[][] = { 
		          { 1, 2, 3 }, 
		          { 2, 4, 6, 8 }, 
		          { 5, 6, 7, 8,5},

        };
		
		
		//In above array column size is not fixed, so how we can access this array ?
		//This array is called Jagged array
		
		
		System.out.println("Printing Jagged array elements");
		for(int i=0;i<d1.length;i++)  //instead of rows we will take length so it will give number of arrays within array
		{
			for(int j=0;j<d1[i].length;j++)  //will give all the elements of array[i]
			{
				System.out.print(" "+d1[i][j]);
			}
			System.out.println();
		}
		
		


	}

}
