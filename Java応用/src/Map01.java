import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map01 {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<String, String> map2 = new TreeMap<String, String>();

//		要素追加
		map1.put(0, "ぶどう");
		map1.put(3, "もも");
//		登録済みキーは上書きされる
		map1.put(0, "マスカット");
//		要素の取得
		System.out.println(map1.get(0));
		System.out.println(map1.get(1));
//		キーの存在チェック
		System.out.println(map1.containsKey(0));
//		値の存在チェック
		System.out.println(map1.containsValue("ぶどう"));

//		要素数
		System.out.println(map1.size());
//		要素削除(キー指定)
		map1.remove(0);
//		要素削除(キーと値指定)
		map1.remove(3, "もも");

		System.out.println(map1.size());
	}
}
