package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics04 {
	public static void main(String[] args) {
		List<? extends Fruit> fruits;
		List<Apple> apples = new ArrayList<>();

		fruits = apples;
	}
}
