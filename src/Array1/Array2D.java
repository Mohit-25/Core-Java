package Array1;

import java.util.Scanner;

public class Array2D {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter same value of row and column of 2D Array");
		
		int row=sc.nextInt();
		int column=sc.nextInt();
		int a[][]=new int[row][column];
		int m=column-1;
		if(row==column)
		{
			
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Primary");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					if(i==j)
					{
					  System.out.print(a[i][j]+" ");
					}
				}
			}
			System.out.println();
			System.out.println("Secondary");
			for(int i=0;i<row;i++)
			{
				System.out.print(a[i][m]+" ");
				m--;
			}
			
			
		
		}
		else
		{
			System.out.println("Enter valid input");
		}
	}

}
