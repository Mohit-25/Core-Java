package String;

public class String2ndWord {

	public static void main(String[] args) {
		
		String s="mohit dobariyaas yash vasani";
		int count=0;
		int flag=0;
		
		String[] s1=s.split("\\s");
		System.out.println("Using Inbuilt Function " +s1[1].length());
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				
				for(int j=i+1;;j++)
				{
					
					if(s.charAt(j)==' ')
					{   
						flag=1;
						 break;
					}
					count++;
					
				}
				if(flag==1)
				{
					break;
				}
				
				
			}
			
		}
		System.out.println(count);
		
	}
}
