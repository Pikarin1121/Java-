package exception;

public class Exception02 {
	public static void main(String[] args) {
//		try�u���b�N�ŗ�O����������\�������鏈�����L��
		try {
			System.out.println("100�@���@0�@�́H");
//			�����ŗ�O������
			int result = 100 / 0;
			System.out.println("�v�Z����" + result);
//			ArithmeticException�N���X�̗�O�����������ꍇ�̗�O����
		} catch (ArithmeticException e) {
			System.out.println("��O������");
		} finally {
//			��O���������Ă����������s
			System.out.println("�v���O���~���O�I��");
		}
	}
}
