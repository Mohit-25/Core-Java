package IO.ObjectOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadMultiObj {
	
		public static void main(String[] args) 
		{
			try 
			{
				FileInputStream fin = new FileInputStream("C:\\Users\\mansi\\eclipse-workspace\\ISM\\listofrecords.txt");
				ObjectInputStream oin = new ObjectInputStream(fin);
				
				Student s[] = (Student[])oin.readObject();
			
				for (int i = 0; i < s.length; i++) 
				{
					s[i].disp();
				}
				
			} catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			} catch (IOException e) 
			{
				e.printStackTrace();
			} catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
			}
			
			
			
		}
	}


