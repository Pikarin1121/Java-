import java.util.ArrayList;
import java.util.List;

public class List02 {
	public static void main(String[] args) {
		List<String> prefectures = new ArrayList<>();
		prefectures.add("�k�C��");
		prefectures.add("�X��");
		prefectures.add("�H�c��");

		for (String prefecture : prefectures) {
			System.out.println(prefecture);
		}
	}
}
