package String;


public class HashCode {
	public static void main(String[] args) {
		


	String s1="rahul";
	String s2= new String("rahul");
	String s3="rahul";
	
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	}
}
