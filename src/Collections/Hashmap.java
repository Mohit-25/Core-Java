package Collections;
import java.util.*;

public class Hashmap {

		public static void main(String[] args) 
		{
			HashMap<Integer, String> map = new HashMap<Integer, String>();
			map.put(1, "rahul");
			map.put(2, "rakesh");
			map.put(3, "rohit");
			map.put(4, "sanjay");
			map.put(5, "arjun");

			for( Map.Entry<Integer, String>	 e : map.entrySet()) 
			{
				System.out.println(e.getKey() + " " +e.getValue());
			}
		}
	}

