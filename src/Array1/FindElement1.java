package Array1;

import java.util.Scanner;

public class FindElement1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value");
		int size=sc.nextInt();
		int[] val=new int[size];
		int[] odd=new int[size];
		int[] even=new int[size];
		int j=0;
		int k=0;
		
		System.out.println("Enter " +size+ "value");
		for(int i=0;i<size;i++)
		{
			
			val[i]=sc.nextInt();
			
			if(val[i]%2==0)
			{
				even[j]=val[i];
				j++;
			}
			else
			{
				odd[k]=val[i];
				k++;
			}
		}
		
		System.out.println("Odd Array ");
		for(int m=0;m<k;m++)
		{
			System.out.print(odd[m]+" ");
		}
		System.out.println();
		System.out.println("Even Array ");
		for(int m=0;m<j;m++)
		{
			System.out.print(even[m]+ " ");
		}
		
	}
}
