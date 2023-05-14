package Object;
import java.util.*;
public class ClassObject {

	
		 
		private int rno;
		private String name;
		private int std;
		
		public void ScanData()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Your Roll no");
			rno=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Your Name");
			name=sc.nextLine();
			System.out.println("Enter Your std");
			std=sc.nextInt();
		}
		
	
		public void Display()
		{
			System.out.println(rno +" " + name +" "+ std);
		}
	
}
