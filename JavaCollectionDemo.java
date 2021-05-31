import java.util.List;
import java.util.LinkedList;


public class JavaCollectionDemo {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		
		list.add("Anusha");
		list.add("Welcome");
		list.add("to");
		list.add("Collections");
		
		list.addAll(list);			
		System.out.println("List" +list);
	}
}
