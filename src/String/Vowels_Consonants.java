package String;

public class Vowels_Consonants {

	public static void main(String[] args) {

		String s1 = "Yash, vasani";

		int Vowels = 0;
		int Cons = 0;

		s1 = s1.toLowerCase();
		for (int i = 0; i < s1.length(); i++) 
		{

			if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
					|| s1.charAt(i) == 'u') 
			{
				Vowels++;
			} 
			else if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') 
			{
				Cons++;
			}

		}

		System.out.println("Consonants are" + Cons);
		System.out.println("Vowels are" + Vowels);
	}
}
