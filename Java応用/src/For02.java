
public class For02 {
//	拡張for文 主にコレクション、配列の処理で用いる
	public static void main(String[] args) {
//		int[] array = {...} でも可能
		int array[] = {1, 2, 3, 4, 5};
		for (int num :array) {
			System.out.println("For02 = " + num);
		}
	}
}
