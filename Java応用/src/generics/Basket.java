package generics;

import java.math.BigDecimal;

class Basket<E extends Fruit> {
	private E elem;
	private final BigDecimal PRICE = new BigDecimal(100);

	Basket(E e) {
		elem = e;
	}

	void replace(E e) {
		elem = e;
	}

	E get() {
		return elem;
	}

	void printName() {
		System.out.println("�Ă̒��g��" + elem.getName() + "�ł��B");
	}

	void printTotalPrice() {
		BigDecimal totalPrice = PRICE.add(elem.getPrice());
		System.out.println(elem.getName() + "�̓������Ă͍��v" + totalPrice + "�~�ł�");
	}
}
