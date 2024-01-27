package LogicalPrograms;

public class VerticalStars
{
	public static void main(String[] args)
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("*");
		}
		System.out.println("===============");
		
		for(int i=0;i<=5;i++)
		{
			System.out.print("* ");
		}
		System.out.println();
		
		System.out.println("***********************");

		//* * * * *
		//* * * * *   //rows=4,coloumns=5;number of starin first row=5
		//* * * * *
		//* * * * *
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	
	

}
