package Polymorphism;

import java.util.Scanner;

public class VehicleDetails {
	
 public static void main(String[] args) {
	 
	 System.out.println("Enter Value");
	 System.out.println("Type 1 for MCWG");
	 System.out.println("Type 2 for LMV");
     System.out.println("Type 3 for HMV");
		
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		Vehicle v=null;
		//Vehicle v=new Vehicle();
		switch(i)
		{
		case 1:  v = new Mcwg();
		         ((Mcwg)v).Getspec();
		        //(Mcwg(v)).getspec();
		         break;
		case 2:  v = new Lmv();
                ((Lmv)v).Getspec();
                 break;
              
		case 3:  v = new Hmv();
                 ((Hmv)v).Getspec();
                 break;
		
		}
		
		System.out.println();
	
}
	
}
