package extend.phone;

public interface Phone {
	final int MAX_NUMBER_DIGIIS = 11;

	void call(String number);

	default void powerOff() {
		System.out.println("�d����؂�܂��B");
	}
}