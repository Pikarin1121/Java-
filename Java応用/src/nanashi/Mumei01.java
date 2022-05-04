package nanashi;

import java.util.*;

public class Mumei01 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, -8, 4, 2);

//		”š¬‚³‚¢‡‚É•À‚×‚é
		Collections.sort(
				numbers,
				new Comparator<Integer>() {
					@Override
					public int compare(Integer x, Integer y) {
						return Integer.compare(x, y);
					}
				});
		System.out.println(numbers);
	}
}
