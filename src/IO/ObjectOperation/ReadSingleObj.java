package IO.ObjectOperation;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadSingleObj {
	
		public static void main(String[] args) 
		{
			try (
					FileInputStream fin = new FileInputStream("C:\\Users\\mansi\\eclipse-workspace\\ISM\\list.txt");
					ObjectInputStream oin = new ObjectInputStream(fin);
				)
			{
				Student studObj = (Student)oin.readObject();
				studObj.disp();

//				Object obj = oin.readObject();
//				Student studObj = (Student)obj;
				
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}


