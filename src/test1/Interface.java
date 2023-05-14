package test1;

interface A
{
	public static void m1()
	{
		
	};
}

interface intern extends A
{
	public static void m1()
	{
		System.out.println("M1 in Interface");
	}

	
}

interface Inter2 extends intern{
	
	public static void m1()
	{
	    intern.m1();
	}
	
}


public class Interface
{
	
		public static void main(String[] args) {
			
			
			Inter2.m1();
		}
}

