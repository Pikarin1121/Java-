
public class ClassMethod01 {
	public static void main(String[] args) {
		Human01 yamada = new Human01(); //�C���X�^���X�����́Anew ...()�@�̌`
		System.out.println("���O��" + yamada.name + "�ŁA�N���" + yamada.age + "�ł��B");

		Human01 sato = new Human01("����",25); //���̏ꍇ�A()���Ɉ���������
		System.out.println("���O��" + sato.name + "�ŁA�N���" + sato.age + "�ł��B");
	}
}
