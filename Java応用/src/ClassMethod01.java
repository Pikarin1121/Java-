
public class ClassMethod01 {
	public static void main(String[] args) {
		Human01 yamada = new Human01(); //インスタンス生成は、new ...()　の形
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

		Human01 sato = new Human01("佐藤",25); //この場合、()内に引数を入れる
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
	}
}
