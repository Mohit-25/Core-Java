package IO.ByteOrientedWay;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read {


		public static void main(String[] args) 
		{
			StringBuilder sb = new StringBuilder();
			FileInputStream fin = null;
			try 
			{
				fin = new FileInputStream("C:\\Users\\mansi\\eclipse-workspace\\ISM\\test1.txt");

				int temp ;
				
				while(	(temp = fin.read())	!= -1	) 
				{
					sb.append((char)temp);
				}
			} catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
			System.out.print("Final String : "+ sb);
		}
	}

