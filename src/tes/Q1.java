package tes;

//1. Write a program to print the area and perimeter of a triangle having sides of 
//3, 4 and 5 units by creating a class named 'Triangle' without 
//any parameter in its constructor. value given by using getter setter.

class Triangle {
	double a;
	double b;
	double c;
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public void Area()
   {
	   double area=(0.5)*(a)*(b);
	   System.out.println("Area of Triangle " +area);
       
	   double per=a+b+c;
	   System.out.println("Perimeter of Triangle "+per);
   }
   
   
}
public class Q1{
	
	public static void main(String[] args) {
		
		Triangle t=new Triangle();
		t.setA(3);
		t.setB(4);
		t.setC(5);
		
		t.Area();
		
	}
	
}


