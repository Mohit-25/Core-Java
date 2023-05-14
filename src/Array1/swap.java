package Array1;

import java.util.Scanner;

public class swap {

	public static void main(String[] args)
{
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value");
	int size=sc.nextInt();
	
	int[] val=new int[size+1];
	
	System.out.println("Enter " +(size-1)+ "value");
	for(int i=0;i<size-1;i++)
	{
		
		val[i]=sc.nextInt();
	}
	
	System.out.println("Enter Index");
	int index=sc.nextInt();
	System.out.println("Enter Element");
	int ele=sc.nextInt();
	
	for(int i=size-1;i>=index;i--)
	{
		val[i+1]=val[i];
		
	}
	val[index]=ele;
	
	for(int m=0;m<size;m++)
	{
		System.out.print(val[m]+ " ");
	}
	
	
	
	
 }
}
