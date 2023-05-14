package tes;

import java.util.Scanner;

//Check element is present in array or not 
//if present that print found at which index 
//if not present than print not found. 
public class Search {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number ");
		int val=sc.nextInt();
		int a[]=new int[val];
		int j=0;
		boolean flag=true;
		for(int i=0;i<val;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter Element to search in array ");
		int ele=sc.nextInt();
		for(j=0;j<val;j++)
		{
			if(ele==a[j])
			{
				System.out.println("Element found at Index no " +j);
				flag=false;
				break;
				
			}
			
		}
		if(flag)
		{
			System.out.println("Element Not Found");
		}
	}

}
