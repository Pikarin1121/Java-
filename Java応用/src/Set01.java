import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set01 {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();

		set1.add("�X�C�J");
		set1.add("������");

//		�v�f���݃`�F�b�N
		System.out.println(set1.contains("�X�C�J"));
		System.out.println(set1.contains("�Ȃ�"));
//		�v�f��
		System.out.println(set1.size());
//		�v�f�폜
		set1.remove("�X�C�J");

		System.out.println(set1.size());
	}
}