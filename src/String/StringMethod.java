package String;

public class StringMethod {

	public static void main(String[] args) 
	{
		String string = "Mohit";
		String stringOne = "Dobariya";
		String stringTwo = "Mohit";

		// ! String charAt() method
		// It returns char value for the particular index
		System.out.println(string.charAt(0));
		// Print String s1 char index
		System.out.println(stringOne.charAt(0));

		// ! String concate() method
		// method combines specified string at the end of this string
		String stringThree = string.concat(stringOne);
		System.out.println(stringThree);

		// ! String is equal() method
		// It checks the equality of string with the given object.
		System.out.println(string.equals(stringTwo)); // true because content and case is same
		System.out.println(stringTwo.equals(stringThree)); // false because case is not same
		System.out.println(string.equalsIgnoreCase(stringTwo)); // It compares another string. It doesn't check case.

		// ! String split() method
		// It returns a split string matching regex and limit.
		String splitString = "java string split method";
		String[] splitWords = splitString.split("\\s"); // Splits the string based on whitespace
		// Using java foreach loop to print elements of string array
		for (String splitWord : splitWords) {
			System.out.println(splitWord);
		}
		String s1 = "welcome to split world";
		System.out.println("returning words:");
		for (String w : s1.split("\\s", 0)) {
			System.out.println(w);
		}
		System.out.println("returning words:");
		for (String w : s1.split("\\s", 1)) {
			System.out.println(w);
		}
		System.out.println("returning words:");
		for (String w : s1.split("\\s", 2)) {
			System.out.println(w);
		}

		// ! String length() method
		// It returns string length
		String stringLength = "RoyalTechnosoft";
		System.out.println("string length is: " + stringLength.length());

		// ! String replace() Method.
		String stringReplace = "Mohit is a very good person";
		String replaceString = stringReplace.replace('a', 'e'); // Replaces all occurrences of 'a' to 'e'
		System.out.println(replaceString);
		
		//!String replaceAll() method
		String str = "Java T point";  
		System.out.println(str);  
		String last1 = str.replace("\\s", "");  
		String last2= str.replaceAll("\\s", "");//It accepts regex(regular expressions)
		
		System.out.println(last1); //Java T point
		System.out.println(last2); //JavaTpoint

		//! String compareTo() method.
		// method compares the given string with the current string lexicographically.
		// It returns a positive number, negative number, or 0.
		String c1 = "hello";
		String c2 = "hello";
		String c3 = "meklo";
		String c4 = "hemlo";
		String c5 = "flag";
		System.out.println(c1.compareTo(c2));// 0 because both are equal
		System.out.println(c1.compareTo(c3));// -5 because "h" is 5 times lower than "m"
		System.out.println(c1.compareTo(c4));// -1 because "l" is 1 times lower than "m"
		System.out.println(c1.compareTo(c5));// 2 because "h" is 2 times greater than "f"

		// ! String contains() method
		// It internally uses indexOf()
		// It returns true or false after matching the sequence of char value.
		String stringContains = "what do you know about me";
		System.out.println(stringContains.contains("do you know"));

		// ! String indexOf() method

		// It returns the specified substring index.
		String m1 = "this is index of example";
		// passing substring
		int index1 = m1.indexOf("is");// returns the index of is substring
		int index2 = m1.indexOf("index");// returns the index of index substring
		System.out.println(index1 + "  " + index2);// 2 8

		// It returns the specified substring index starting with given index.
		// passing substring with from index
		int index3 = m1.indexOf("is", 4);// returns the index of is substring after 4th index
		System.out.println(index3);// 5 i.e. the index of another is

		// passing char value
		int index4 = m1.indexOf('s');// returns the index of s char value
		System.out.println(index4);// 3

		//! String endsWith() method
		// method checks if this string ends with a given suffix
		// It internally uses startsWith()
		String StringEndsWith = "java is programming language";
		System.out.println(StringEndsWith.endsWith("g"));
		System.out.println(StringEndsWith.endsWith("language"));

		//! String startWith() method
		//method checks if this string starts with the given prefix
		String sw = "Javatpoint";    
		
        // no offset mentioned; hence, offset is 0 in this case.  
        System.out.println(sw.startsWith("J")); // True    
  
        // no offset mentioned; hence, offset is 0 in this case.  
        System.out.println(sw.startsWith("a")); // False   
        
        // offset is 1  
        System.out.println(sw.startsWith("a",1)); // True

		// ! String format() method
		// It returns a formatted string
		String formetName = "Mohit";
		String stringFormet = String.format("name is %s", formetName);
		System.out.println(stringFormet);
		String str1 = String.format("%d", 101); // Integer value
		String str2 = String.format("%s", "Amar Singh"); // String value
		String str3 = String.format("%f", 101.00); // Float value
		String str4 = String.format("%x", 101); // Hexadecimal value
		String str5 = String.format("%c", 'c'); // Char value
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);

		//! String getBytes() method
		//method does the encoding of string into the sequence of bytes, 
		//and keeps it in an array of bytes.
		String stringByte = "ABCDEFG";
		byte[] byteNo = stringByte.getBytes();
		for (int i = 0; i < byteNo.length; i++) {
			System.out.println(byteNo[i]);
		}

		//! toCharArray() method 
		String a1="hello";  
		char[] ch=a1.toCharArray();  
		for(int i=0;i<ch.length;i++){  
		System.out.print(ch[i]);  
		
		//!String getChars() method
		// method copies the content of this string into a specified char array
		String stringCharactor = new String("hello how r u");
		char[] charactor = new char[10];
		try {
			stringCharactor.getChars(6, 16, charactor, 0);
			System.out.println(charactor);
		} catch (Exception ex) {
			System.out.println(ex);
		}

		// ! String intern() method
		// It returns an interned string.
		String stringIntern = new String("hello");
		String stringInternOne = new String("how are u");
		String Intern = stringIntern.intern(); // returns string from pool, now it will be same as stringIntern
		System.out.println(stringIntern == stringInternOne);
		System.out.println(stringInternOne == Intern);

		// ! String isEmpty() method
		String emptyString = "";
		String nullstring = null;
		System.out.println(emptyString.isEmpty());
		System.out.println(nullstring.isEmpty());

		// ! String join() method
		// It returns a joined string.
		String joinString = String.join("-", "welcome", "to", "Darshit");
		System.out.println(joinString);

		//! String lastIndexOf() method
		//method returns the last index of 
		//the given character value or substring
		String l = "Tshis is insssdex of examplse";  
        int index = l.lastIndexOf('s',10); //It checks upto 10th index 
        System.out.println(index);

		//!String replace() method
        String r1="my name is khan my name is java";  
        String replaceString1=r1.replace("is","was");//replaces all occurrences of "is" to "was"  
        System.out.println(replaceString1);  
        
        // !String replaceAll() method
		String replaceWord = "java is a very good programming language";
		String stringReplaceAll = replaceWord.replaceAll("a", "e"); // replaces all occurrences of "a" to "e"
		System.out.println(stringReplaceAll);

		// ! String subString() method
		// It returns substring for given begin index and end index.
		String subString = "java";
		System.out.println(subString.substring(1, 3));

		// ! String lowerCase() and upperCase() method
		String lowerCaseWord = "HELLO stRIng";
		String upperrCaseWord = "HELLO stRIng";
		String stringLowerCase = lowerCaseWord.toLowerCase();
		System.out.println(stringLowerCase);
		String stringUpperCase = upperrCaseWord.toUpperCase();
		System.out.println(stringUpperCase);

		// ! String trim() method
		// This method eliminates leading and trailing spaces
		// This method doesn't omit middle spaces.
		String stringTrim = " hello string  ";
		System.out.println(stringTrim + "java"); // without trim()
		System.out.println(stringTrim.trim() + "java"); // with trim()

		// ! String valueOf() method
		// It internally uses toString()
		int value = 30;
		String stringValue = String.valueOf(value);
		System.out.println(stringValue + 10); // concatenating string with 10 
    }
} 
