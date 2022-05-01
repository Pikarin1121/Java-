package generics;

import java.math.BigDecimal;

public class Generics02 {
	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("�ӂ�", new BigDecimal(500)));
		System.out.println(appleBasket.get().getName());

		appleBasket.replace(new Apple("�g��", new BigDecimal(400)));
		System.out.println(appleBasket.get().getName());
	}
}

