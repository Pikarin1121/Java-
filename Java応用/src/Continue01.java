
public class Continue01 {
	public static void main(String[] args) {
		for (int count = 0; count < 5; count++) {
			if (count == 2) {
//				countが2になった時、この処理だけスキップ
				continue;
			}
			System.out.println("Continue01 = " + count);
		}
	}
}
