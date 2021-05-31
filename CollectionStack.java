import java.util.Stack;

public class CollectionStack {
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("Anusha");
		stack.push("teju");
		stack.push("Ajith");
		stack.push("Sai");
		
		stack.pop();
					
		System.out.println("Stack" +stack);
	}
}
