package Inheritance;


class Person
{
  String name="mohit";
	
}
class Employee extends Person
{
	int salary=50000;
}

class Programmer extends Employee
{
	int bonus=10000;
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		
		Programmer p=new Programmer();
		
		System.out.println(p.name+" "+ p.salary+" "+ p.bonus);
	}
}
