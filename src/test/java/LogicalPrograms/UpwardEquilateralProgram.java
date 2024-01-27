package LogicalPrograms;

public class UpwardEquilateralProgram {
//      * 
//	   *** 
//    ***** 
//	 *******
	//rows=4;coloumns=7;no.of stars in first row=1;no of space in first row=3
	
	public static void main(String[] args)
	{
		    int stars=1;
	        int space=3;
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
	            stars=stars+2;
	            space--;
	            System.out.println();
	        }
	    }

	}


