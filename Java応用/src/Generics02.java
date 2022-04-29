import java.util.List;
import java.util.ArrayList;

class Basket<E> {
	private E elem;

	Basket(E e) {
		elem = e;
	}

	void replace(E e) {
		elem = e;
	}

	E get() {
		return elem;
	}
}

class Apple {
	private String name;

	Apple(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
}

class Peach {
	private String name;

	Peach(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
}

public class Generics02 {
	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("Ç”Ç∂"));
		System.out.println(appleBasket.get().getName());

		appleBasket.replace(new Apple("çgã "));
		System.out.println(appleBasket.get().getName());
	}
}

