package String;

public class Palindrome {

	public static void main(String[] args) {
		
	
	String name="madam";

	boolean flag=true;
	int l=name.length();
	
	
	for(int i=0;i<=l/2;i++)
	{
		if(name.charAt(i)!=name.charAt(l-i-1))
		{
			flag=false;
			break;
		}
		
	}
	
	if(flag)
	{
		System.out.println("String is palindrome");
	}
	else
	{
		System.out.println("String is not palindrome");
	}
 }
}
