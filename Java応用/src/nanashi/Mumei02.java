package nanashi;

import java.util.*;

public class Mumei02 {
	public static void main(String[] args) {
		List<String> animals = Arrays.asList("dog", "cat", "fox", "elephant");

// 		�A���t�@�x�b�g���ɕ��ׂ�
		Collections.sort(
				animals,
				new Comparator<String>() {
					@Override
					public int compare(String x, String y) {
//						�������悭�킩��Ȃ��c
						return x.compareTo(y);
					}
				});
		System.out.println(animals);
 	}
}
