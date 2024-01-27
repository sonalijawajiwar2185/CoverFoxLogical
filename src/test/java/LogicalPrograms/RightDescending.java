package LogicalPrograms;

public class RightDescending {

	public static void main(String[] args)
	{
		//*****
		// ****    
		//  ***
		//   **
		//    *
		
		//rows=5,coloumns=5,number of star in first line=5,number of space in first line=0,
      int star=5;
      int space=0;
		for(int i=1;i<=5;i++)//rows
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			
			star--;
			space++;
			System.out.println();
		}
//        for(int i=5;i>=1;i--)//rows
// 		 {
//  			for(int j=i;j>=1;j--)
//  			{
//  				System.out.print(" *");
//  			}
//  			System.out.println();
// 		 }
      
		
		
		
	}

}
