package IO.CharOrientedWay;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Read {
	
		public static void main(String[] args) 
		{
			try 
			{
				FileReader fr = new FileReader("C:\\Users\\mansi\\eclipse-workspace\\ISM\\test2.txt");
				int temp ;
				while(	(temp  = fr.read()) != -1)	 
				{
					System.out.print((char)temp);
				}
			
			} catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}


