
public class Break01 {
	public static void main(String[] args) {
		for (int count = 0; count < 5; count++) {
			if (count == 2) {
//				count‚ª2‚É‚È‚Á‚½ŽžAfor•¶‚ðI‚í‚ç‚¹‚é‚Ì‚Ébreak‚ðŽg‚¤
				break;
			}
			System.out.println("Break01 = " + count);
		}
	}
}
