
public class DoWhile01 {
	public static void main(String[] args) {
		int num = 100;

//		最初からwhileの条件外でも１回は実行される
		do {
			num *= 2;
			System.out.println("DoWhile01 = " + num);
		} while (num < 50);
	}
}
