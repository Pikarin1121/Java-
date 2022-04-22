package enumpractice;

public class Enum01 {
	public static void main(String[] args) {
		Dessert apple = Dessert.valueOf("APPLE");
		System.out.println(apple);
	}

	static void printDessertName(Dessert dessert) {
		System.out.println(dessert);
	}
}
