package tes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Comparator.Student;

//Add 5 elements in the array list and print that array list using an iterator. 
public class list {
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 elements ");
		
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		
		Iterator<Student>itr = list.iterator();
		
		while(itr.hasNext())
		{                  
			 System.out.println(itr.next()); 
				                                     
		}       
		
		
	}

}
