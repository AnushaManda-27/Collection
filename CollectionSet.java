import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionSet {
	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("Anusha");
		set.add("Ajith");
		set.add("Teju");
		set.add("Sai");
		
		set.addAll(set);			
		System.out.println("Set" +set);
	}
}
