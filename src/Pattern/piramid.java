package Pattern;

public class piramid {

	public static void main(String[] args) {
		int rows=5;
		
		
		for(int i=0;i<rows;i++)
		{
			
			for(int j=rows;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		for(int i=1;i<=rows;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=rows-i;k>=0;k--)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}
