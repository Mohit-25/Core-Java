package String;

public class CharAt {

	public static void main(String[] args) {
		
		char name[]= {'m','o','h','i','t'};
//		name.length--->Array size
		
		String name1= "mohit";
		
		for(int i=0;i<name.length;i++)
	    {
	    	System.out.print(name[i]);
	    }
		   System.out.println(" ");
		   
	    for(int i=0;i<name1.length();i++)
	    {
	    	System.out.print( name1.charAt(i));
	    }
	    
	    System.out.println(" ");
	    
	    for(int i=(name1.length()-1);i>=0;i--)
	    {
	    	System.out.print( name1.charAt(i));
	    }
		
	}
}
