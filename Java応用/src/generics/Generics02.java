package generics;

import java.math.BigDecimal;

public class Generics02 {
	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("Ç”Ç∂", new BigDecimal(500)));
		System.out.println(appleBasket.get().getName());

		appleBasket.replace(new Apple("çgã ", new BigDecimal(400)));
		System.out.println(appleBasket.get().getName());
	}
}

