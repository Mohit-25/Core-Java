package Inheritance;


class Employee1
{
	int salary=20000;
	
	
}
class TechEmp extends Employee1
{
	
	
	void Total()
	{  
		
		System.out.println("salary of Tech Employee is=" +(this.salary+10000));
	}
}
class NonTechn extends Employee1
{ 
	
	void Total()
	{
		System.out.println("salary of Tech Employee is=" +(this.salary+2000));
	}
	
}
public class Hierarchical {
	public static void main(String[] args) {
		
	
	
	TechEmp e1=new TechEmp();
	NonTechn e2=new NonTechn();
	e1.Total();
	e2.Total();
	
	}
	
}
