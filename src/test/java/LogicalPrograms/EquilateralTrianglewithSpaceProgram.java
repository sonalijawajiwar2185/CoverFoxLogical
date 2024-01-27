package LogicalPrograms;

public class EquilateralTrianglewithSpaceProgram {
//  *
// * *
//* * *
//* * * *
//* * * * *
//rows=5;coloumns=5;no.of stars in first row=1;no of space in first row=4
	
	
	
	public static void main(String[] args)
	{
		 int stars=1;
	        int space=4;
	        for(int i=1;i<=5;i++)
	        {
	            for(int j=1;j<=space;j++)
	            {
	                System.out.print(" ");
	            }
	            for(int k=1;k<=stars;k++)
	            {
	                System.out.print("* ");
	            }
	            stars++;
	            space--;
	            System.out.println();
	       

	            }

	}
}
