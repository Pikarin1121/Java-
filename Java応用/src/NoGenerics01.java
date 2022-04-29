import java.util.List;
import java.util.ArrayList;

public class NoGenerics01 {
	public static void main(String[] args) {
		List items = new ArrayList();
//		List<Object> items = new ArrayList<Object>();‚Æ“¯‹`

		items.add("bag");
		items.add(0);
		items.add(true);

		String item1 = (String)items.get(0);
		int item2 = (int)items.get(1);

		System.out.println(item2);
	}
}
