package Test;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		System.out.print("0,1");
		
		int n1=0;
		int n2=1;
	
		int sum=0;
		
		for(int i=0;;i++)
		{
			sum=n1+n2;
			if(sum<num)
			{
				
				System.out.print(","+sum);
				n1=n2;
				n2=sum;
			}
			
			
			
		}
	}
}
