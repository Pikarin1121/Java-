
public class Break01 {
	public static void main(String[] args) {
		for (int count = 0; count < 5; count++) {
			if (count == 2) {
//				countが2になった時、for文を終わらせるのにbreakを使う
				break;
			}
			System.out.println("Break01 = " + count);
		}
	}
}
