import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map01 {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<String, String> map2 = new TreeMap<String, String>();

//		�v�f�ǉ�
		map1.put(0, "�Ԃǂ�");
		map1.put(3, "����");
//		�o�^�ς݃L�[�͏㏑�������
		map1.put(0, "�}�X�J�b�g");
//		�v�f�̎擾
		System.out.println(map1.get(0));
		System.out.println(map1.get(1));
//		�L�[�̑��݃`�F�b�N
		System.out.println(map1.containsKey(0));
//		�l�̑��݃`�F�b�N
		System.out.println(map1.containsValue("�Ԃǂ�"));

//		�v�f��
		System.out.println(map1.size());
//		�v�f�폜(�L�[�w��)
		map1.remove(0);
//		�v�f�폜(�L�[�ƒl�w��)
		map1.remove(3, "����");

		System.out.println(map1.size());
	}
}
