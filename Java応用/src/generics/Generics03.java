package generics;
import java.math.BigDecimal;

public class Generics03 {
	public static void main(String[]args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("�ӂ�", new BigDecimal(200)));
		Basket<Peach> peachBasket = new Basket<>(new Peach("������", new BigDecimal(300)));

		appleBasket.printTotalPrice();
		peachBasket.printTotalPrice();
	}
}
