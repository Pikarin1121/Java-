package practice;

public class Car {
//	燃費は1Lあたりの走行距離
	private double fuelCost;
	private double fuelAmount;

	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}

//	戻り値返さない場合、void ()内に型とその命名
	public void move(int distance) {
		System.out.println(distance + "km　走ります");
		this.fuelAmount -= (distance/fuelCost);
	}

//	戻り値返す場合、型とそのメソッド名で、()内は何も入れない
	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
