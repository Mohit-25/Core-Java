package Exception;
import java.io.*;  


	  
	class Parent{   
	  
	  // defining the method   
	  void msg() throws Exception{  
	    System.out.println("parent method");  
	    }    
	}    
	    
public class exception extends Parent{    
	  
	  // overriding the method in child class  
	  // gives compile time error  
	  void msg() throws ArithmeticException {    
	    System.out.println("TestExceptionChild");    
	  }  
	  
	  public static void main(String args[]) {    
	   Parent p = new exception(); 
	   
		   p.msg(); 
	   
	}    
}
