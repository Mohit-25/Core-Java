package String;
//8)Java Program to find the longest repeating sequence in a string
import java.util.*;

public class RepeatingSequence {
	
	public static void main(String[] args) 
	{
		
	  int temp=1;
	  int max=0;
	  String s1="aaefFfbbbccCccdddd";
	 
	  s1=s1.toLowerCase();
	  int j=0;
	  
	  char [] c=new char[s1.length()];
//	  ArrayList<Integer> list = new ArrayList<>();
//	  ArrayList<Integer> list1 = new ArrayList<>();
	  char ch =' ';
	  for(int i=0;i<=s1.length()-1;i++)
	  {
//		  aaefFfbbbccCccdddd
		  if(i<s1.length()-1 && s1.charAt(i)==s1.charAt(i+1))              
		  {
			  temp++; //3
		  }
		  else
		  {
			  if(temp>=2)
			  {
				  c[j]=s1.charAt(i);
				  System.out.println("Char "+ c[j] +" is repeating "+temp+" times");
//				  list.add(temp);
				  
				  j++;
			  }
			  if(temp>=max)
			  {
				  ch = s1.charAt(i);
				  max=temp; //3
			  }
			  temp=1;
			
	      }
		  
		  
		 
		  
		  }
	  

	  System.out.println("Char "+ ch +" is repeating "+max+" times");
		  
		  System.out.println("Max=" +max);
	 // System.out.println("Char "+ c +" is repeating "+max+" times");

  }
}
