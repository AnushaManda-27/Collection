import java.util.HashMap;
import java.util.Map;


public class CollectionMap {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(101, "hi");
		map.put(105, "Welcome");
		map.put(108, "to");
		map.put(110, "Collectios");
		
		for (Map.Entry m : map.entrySet()) {			
		System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
