import java.util.List;
import java.util.ArrayList;

public class Generics01 {
	public static void main(String[] main) {
		List<String> items = new ArrayList<String>();

		items.add("bag");
		String item = items.get(0);
		System.out.println(item);
	}
}
