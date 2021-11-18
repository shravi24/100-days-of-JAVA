package OOPBasics;

public class EnahncedForLoopExample 
{

	public static void main(String[] args)
	{
		int a[] = { 1, 2, 3, 4 };
		
		System.out.println("Printing the 1D array elemnents using for loop");
		for(int i=0;i<4;i++)
		{
			System.out.print(" "+a[i]);
		}

		System.out.println("\n---------------------------------------------------");
	
		System.out.println("Printing the 1D array elemnents using Enahnaced for loop OR ForEach");
		//Enahnced or ForEach Loop
		
		for(int k :a)         //in each iteration value in a will be assigned to k and printed. Assigned and printed one by one 
		{
			System.out.print(" "+k);
		}
		
		System.out.println("\n---------------------------------------------------");
		System.out.println("Printing the Jagged array elements using Enahnaced for loop OR ForEach");
		
		int d1[][] = { 
				
		                { 1, 2, 3 }, 
		                { 2, 4, 6, 8 }, 
		                { 5, 6, 7, 8,5},
		          
		             };
		
		//In this, you dont have to focus on giving length of each array that is present within array
		for(int k[] :d1)         //here array's first element is array so k will alos be an array
		{
			for(int l:k)
			{
			System.out.print(" "+l);
			}
			System.out.println();
		}
	
		
		System.out.println("\n---------------------------------------------------");
		System.out.println("Printing the 2D array elements using Enahnaced for loop OR ForEach");
		
		int d[][] = { 
		          { 1, 2, 3, 4 }, 
		          { 2, 4, 6, 8 }, 
		          { 5, 6, 7, 8 },

          };
		
		for(int k[] :d)         //here array's first element is array so k will alos be an array
		{
			for(int l:k)
			{
			System.out.print(" "+l);
			}
			System.out.println();
		}
	}

}
