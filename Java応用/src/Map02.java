import java.util.HashMap;
import java.util.Map;

public class Map02 {
	public static void main(String[] args) {
		Map<Integer, String> classmates = new HashMap<>();
		classmates.put(1, "��");
		classmates.put(2, "�΍�");
		classmates.put(3, "����c");

//		�L�[�̂�
		for (Integer key : classmates.keySet()) {
			System.out.println(key);
		}

//		�l�̂�
		for (String name : classmates.values()) {
			System.out.println(name);
		}

//		�L�[�ƒl�̃y�A
		for (Map.Entry<Integer, String> classmate :classmates.entrySet()) {
			System.out.println(classmate.getKey() + "�Ԃ�" + classmate.getValue() + "����");
		}
	}
}
