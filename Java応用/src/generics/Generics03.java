package generics;
import java.math.BigDecimal;

public class Generics03 {
	public static void main(String[]args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("Ç”Ç∂", new BigDecimal(200)));
		Basket<Peach> peachBasket = new Basket<>(new Peach("â©ã‡ìç", new BigDecimal(300)));

		appleBasket.printTotalPrice();
		peachBasket.printTotalPrice();
	}
}
