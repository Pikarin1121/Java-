package practice;

public class Car {
//	�R���1L������̑��s����
	private double fuelCost;
	private double fuelAmount;

	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}

//	�߂�l�Ԃ��Ȃ��ꍇ�Avoid ()���Ɍ^�Ƃ��̖���
	public void move(int distance) {
		System.out.println(distance + "km�@����܂�");
		this.fuelAmount -= (distance/fuelCost);
	}

//	�߂�l�Ԃ��ꍇ�A�^�Ƃ��̃��\�b�h���ŁA()���͉�������Ȃ�
	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
