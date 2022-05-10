
public class Chapter07 {
	public static void main(String[] args) {
		int instance = 3;
		if (instance <= 5) {
			System.out.println("とても近いです");
		} else if (instance > 5 && instance <= 10) {
			System.out.println("近いです");
		} else if (instance > 10 && instance <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}

		String color = "blue";
//		変数が決まっている場合はswitch文の方がよい
		switch (color) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "yellow":
			System.out.println("黄信号です");
			break;
		case "blue":
			System.out.println("青信号です");
			break;
		default:
			System.out.println("信号の色ではない");
		}
	}
}
