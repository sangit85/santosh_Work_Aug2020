import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Integer,String>  m =new HashMap<Integer,String>();
		m.put(new Integer(10),"Mumbai");
		m.put(new Integer(34), "xyz");
		m.put(new Integer(23) ,"delhi");
		
		//Set e=m.entrySet();
		
		for(Map.Entry x:m.entrySet())
		{
			System.out.println(x.getKey()+""+x.getValue());
			
		}
		
		

	}

}
