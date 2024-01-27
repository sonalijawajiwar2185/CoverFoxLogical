package LogicalPrograms;

public class LeftAscendingProgram {

	public static void main(String[] args)
	{
		//*
		//* *
        //* * *
		//* * * *
		//* * * * *
		int star=1;
		
		//rows=5,coloumns=5,number of star in first line=1.
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			star++;
			System.out.println();
		}
		
		
		
	}

}
