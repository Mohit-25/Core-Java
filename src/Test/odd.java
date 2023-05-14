package Test;

public class odd {

	public static void main(String[] args) {
		
	int sum=0;
	for(int i=1;i<=50;i++)
	{
		if(i%2 != 0)
		{
			System.out.println(i);
			
		}
		if(i%2==0)
		{
			sum=sum+i;
			
		}
		
		
	}
	System.out.println(sum);
	}
}
