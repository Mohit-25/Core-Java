package String;

public class Punctuation {

	public static void main(String[] args) {
		
		String s1="mohit!.,;()";
		
		String updated= s1.replaceAll("[^A-Za-z0-9@#$%&*]","");
		System.out.println(updated);
		System.out.println(updated.length());
		//System.out.println(s1.length());
		//System.out.println(s1.length()-updated.length());
		
		
		
	}
}
