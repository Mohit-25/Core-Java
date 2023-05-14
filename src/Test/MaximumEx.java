package Test;

import java.util.Scanner;

public class MaximumEx {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	    System.out.println("Enter Three Numbers");
	    System.out.print("A=");
	    int a=sc.nextInt();
	    System.out.print("B=");
	    int b=sc.nextInt();
	    
	    System.out.print("C=");
	    int c=sc.nextInt();
	    
	    
	    if(a==b && b==c && c==a)
	    {
	    	System.out.println("All are Equal");
	    }
	    else if(a==b || b==c || a==c)
	    {
	    	if(a==b && a>c)
	    	{
	    		System.out.println("A and B are same and greater than C");
	    	}
	    	else if(a==b && a<c)
	    	{
	    		System.out.println("A and B are same and less than C");
	    	}
	    	else if(b==c && b>a)
	    	{
	    		System.out.println("B and C are same and greater than A");
	    	}
	    	else if(b==c && b<a)
	    	{
	    		System.out.println("B and C are same and less than A");
	    	}
	    	else if(c==a && c>b)
	    	{
	    		System.out.println("A and C are same and greater than B");
	    	}
	    	else if(c==a && c<b)
	    	{
	    		System.out.println("A and C are same and less than B");
	    	}
	    }
	    else
	    {
	    	if(a>b)
	    	{
	    		if(a>c)
	    		{
	    			System.out.println("A is Maximum");
	    		}
	    		
	    	}
	    	else 
	    	{
	    		if(b>c)
	    		{
	    			System.out.println("B is Maximum");
	    		}
	    		else
	    		{
	    			System.out.println("C is maximum");
	    		}
	    		
	    	}
	    }
	    	
	}

}
