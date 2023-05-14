package Problem;

import java.util.Arrays;
import java.util.Scanner;

public class Occurance {
	
	static void count(String s)
	{
		
		char[]c=s.toCharArray();
		Arrays.sort(c);
		String str = String.valueOf(c);
		System.out.println(str);
//		aaahinssvyyz
		int temp=1;
		for(int j=0;j<str.length()-1;j++)
		{
			if(j==str.length()-2)
			{
				if(str.charAt(j)==str.charAt(j+1))
				{
					
					temp++; 
					System.out.println(str.charAt(j)+"is repeting " +temp+ " times ");
					
				}
				else
				{
					System.out.println(str.charAt(j)+"is repeting " +temp+ " times ");
					System.out.println(str.charAt(j+1)+"is repeting 1 times ");
					
				}
				
			}
			else if(str.charAt(j)==str.charAt(j+1))
			{
				temp++; 
				
			}
			else
			{
				
				System.out.println(str.charAt(j)+"is repeting " +temp+ " times ");
				temp=1;
			}
		}
		
		
		
		
	
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.next();
		
		count(s);
		
		
	}
}

