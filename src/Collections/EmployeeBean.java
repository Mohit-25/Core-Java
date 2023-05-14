package Collections;

import java.util.Scanner;

public class EmployeeBean {
	
	Scanner sc=new Scanner(System.in);
	public Employee insert()
	{
		Employee e=new Employee();
		System.out.println("Enter = id,name,salary,position,orgname");
		System.out.println("Enter id");
		e.setId(sc.nextInt()); 
		sc.nextLine();
		System.out.println("Enter Name");
		e.setName(sc.nextLine());
		System.out.println("Enter Salary");
		e.setSalary(sc.nextLong());
		sc.nextLine();
		System.out.println("Enter Position");
		e.setPosition(sc.nextLine());
		System.out.println("Enter Organization name");
		e.setOrgname(sc.nextLine());
		
		return e;
		
	}
	public void update(int id,Employee e)
	{
		
//		[id=123, name=er, salary=344, position=er, orgname=er]
		
		System.out.println("Enter values");
		
		System.out.println("Enter Name");
		e.setName(sc.nextLine());
		System.out.println("Enter Salary");
		e.setSalary(sc.nextLong());
		sc.nextLine();
		System.out.println("Enter Position");
		e.setPosition(sc.nextLine());
		System.out.println("Enter Organization name");
		e.setOrgname(sc.nextLine());
		
		
		
		
	}
	
	

}
