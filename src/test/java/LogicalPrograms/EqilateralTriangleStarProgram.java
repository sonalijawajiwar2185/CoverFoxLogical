package LogicalPrograms;

public class EqilateralTriangleStarProgram {

	public static void main(String[] args) {

		//downward equilateral triangle
		//*******
		// *****
		//  ***
		//   *
		//ROWS=4,COLOUMNS=7,NO.OF STARS IN FIRST ROW=7,NO. OF SPACE IN FIRST ROW=0
		int stars=7;
		int space=0;
		for(int i=1;i<=4;i++)
		{
		    for(int j=1;j<=space;j++)
		    {
		        System.out.print(" ");
		    }
		    for(int k=1;k<=stars;k++)
		    {
		        System.out.print("*");
		    }
		    stars=stars-2;
		    space++;
		    System.out.println();
		}
	}

}
