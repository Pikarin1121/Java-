import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set01 {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();

		set1.add("スイカ");
		set1.add("メロン");

//		要素存在チェック
		System.out.println(set1.contains("スイカ"));
		System.out.println(set1.contains("なし"));
//		要素数
		System.out.println(set1.size());
//		要素削除
		set1.remove("スイカ");

		System.out.println(set1.size());
	}
}