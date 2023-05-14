package Object;

public class ClassObject2 {

		public static void main(String[] args) {
			
			//ClassObject2 c1=new ClassObject2();
			
			ClassObject [] c2=new ClassObject[5];
			
			for(int i=0;i<c2.length; i++)
			{
				c2[i]= new ClassObject();
				c2[i].ScanData();
			}
			
			for(int i=0;i<c2.length; i++)
			{
				//s[i]= new Student();
				c2[i].Display();
			}
		}
	}



