package Test;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value");
	    int num=sc.nextInt();
	    int i=0;
	    for(i=2;i<num;i++)
	    {
	    	if(num%i==0)
	    	{
	    		System.out.println("It's not prime number");
	    		break;
	    	}
	    }
	    if(num==i)
	    {
	      System.out.println("number is prime");
	    }
	}

}
