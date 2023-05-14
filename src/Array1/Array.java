package Array1;
import java.util.*;
public class Array {

	public static int[] solutioun(int arr[])
		{  
		   int length=arr.length;
		  
		   
		   int a[]=new int[length*2];
		   for(int i=0;i<length*2;i++)
		   {
//			   
//			   input:1 2 3
//			   output:1 2 3 1 2 3
			   
			   a[i]=arr[i%length];
//			   0/3=0
//			   1/3=1
//			   2/3=2
//			   3/3=0
//			   4/3=1
//			   5/3=2

    
			   
		   }
		   
		   return a;
		   
	
		
		}
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of array: ");
			int n = sc.nextInt();
			int arr[] = new int[n];
			
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			int ans[] = solutioun(arr);
			int size = ans.length;
			for(int i=0;i<size;i++)
			{
				System.out.print(ans[i] + " ");
			}
		}
	}

