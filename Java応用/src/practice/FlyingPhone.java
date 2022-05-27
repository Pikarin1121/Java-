package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
	private int min;

	public FlyingPhone(int min) {
		this.min = min;
	}

	public void fly() {
		System.out.println(min + "���ԁA��т܂��B");
	}

	public void call(String number) {
		System.out.println(number + "�ɓd�b���܂��B�ʘb�ł���͔̂��ł���Ԃ����ł��B");
	}

	public void powerOff() {
		Flying.super.powerOff();
	}
}
