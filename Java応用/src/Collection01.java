import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection01 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<Integer> list2 = new LinkedList<Integer>();

		list1.add("�����S");
		list1.add("�݂���");
//		�ʒu�w�肵�ėv�f�ǉ�
		list1.add(1, "�o�i�i");

		System.out.println(list1.get(0));

		System.out.println(list1.contains("�o�i�i"));
		System.out.println(list1.contains("�Ȃ�"));

		System.out.println(list1.size());

		list1.remove("�o�i�i");
		list1.remove("�Ȃ�");

		list1.remove(0);

//		�v�f�����������ߎc���1�����Ȃ�
		System.out.println(list1.size());
	}
}
