
public class Chapter07 {
	public static void main(String[] args) {
		int instance = 3;
		if (instance <= 5) {
			System.out.println("�ƂĂ��߂��ł�");
		} else if (instance > 5 && instance <= 10) {
			System.out.println("�߂��ł�");
		} else if (instance > 10 && instance <= 15) {
			System.out.println("�����ł�");
		} else {
			System.out.println("�ƂĂ������ł�");
		}

		String color = "blue";
//		�ϐ������܂��Ă���ꍇ��switch���̕����悢
		switch (color) {
		case "red":
			System.out.println("�ԐM���ł�");
			break;
		case "yellow":
			System.out.println("���M���ł�");
			break;
		case "blue":
			System.out.println("�M���ł�");
			break;
		default:
			System.out.println("�M���̐F�ł͂Ȃ�");
		}
	}
}
