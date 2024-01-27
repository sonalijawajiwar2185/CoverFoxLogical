package LogicalPrograms;

public class DownwardequilateralTrianglewithSpace {
	//* * * *
	// * * * 
	//  * *
	//   *
	//rows=4;coloumns=4;no.of stars in first row=4;no of space in first row=0
	public static void main(String[] args)
	{
		int stars=4;
        int space=0;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=stars;k++)
            {
                System.out.print("* ");
            }
            stars--;
            space++;
            System.out.println();
        }
		

	}

}
