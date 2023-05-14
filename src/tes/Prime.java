package tes;

import java.util.Scanner;

//Take one number from the user and check if that number is Prime or not. 
public class Prime {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number ");
		int value=sc.nextInt();
		int i=0;
		if (value==0 || value==1)
		{
			System.out.println("Number is Invalid");
		}
		else
		{
			for(i=2;i<value;i++)
			{
				if(value%i==0)
				{
					System.out.println("Number is not prime");
					break;
				}
			}
			if(i==value)
			{
				System.out.println("Number is Prime");
			}
		}
		
	}

}
