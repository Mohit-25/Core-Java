package Inheritance;

class Car
{
	String color;
	int wheels;
}
class Swift extends Car
{
	
}
public class SingleInheritance {
	public static void main(String[] args) {
	
	

	Swift s=new Swift();
	s.color="white";
	s.wheels=4;
	System.out.println("Color is " +s.color+" " +'\n'+ "Wheels are "+s.wheels);
	
	}
}
