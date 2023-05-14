package IO.ObjectOperation;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteSingleObj {
	
		public static void main(String[] args) 
		{
			Student sobj = new Student(1, "rahul kirpekar", 12);

			try (
					FileOutputStream fout = new FileOutputStream("list.txt");
					ObjectOutputStream out = new ObjectOutputStream(fout);	
				)
			{
				
				out.writeObject(sobj);
				
				System.out.println("Success");
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			
		}
	}

