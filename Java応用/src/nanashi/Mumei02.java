package nanashi;

import java.util.*;

public class Mumei02 {
	public static void main(String[] args) {
		List<String> animals = Arrays.asList("dog", "cat", "fox", "elephant");

// 		アルファベット順に並べる
		Collections.sort(
				animals,
				new Comparator<String>() {
					@Override
					public int compare(String x, String y) {
//						ここがよくわからない…
						return x.compareTo(y);
					}
				});
		System.out.println(animals);
 	}
}
