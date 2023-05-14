package Test;

interface A
{
	//int salary=10;
	public void method1();
}
class B
{
	int salary=20;
	public void method1() {
		System.out.println("Class B method1");
	};
}

class C extends B implements A
{
	public void method()
	{
		C b=new C();
		b.method1();
		System.out.println("Class C method "+b.salary );
	}
//	public void method1()
//	{
//		System.out.println("Class c method1");
//	}
	
}
public class Interface {
	public static void main(String[] args) {
		
		C c=new C();
		
		c.method();
		//System.out.println(c.salary);
	}

	
	
}
