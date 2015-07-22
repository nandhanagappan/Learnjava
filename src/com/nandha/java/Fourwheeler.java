package com.nandha.java;

public class Fourwheeler extends Vehicle {
	public Fourwheeler() {
		super.noOfWheels = 4;
	}

	public static void main(String[] args) {
		Fourwheeler car = new Fourwheeler();
		car.vehicleName = "jack";
		car.vehicleid = 21;
		System.out.println(car.vehicleName + " " + car.vehicleid + " " + car.noOfWheels);
		Fourwheeler jeep = new Fourwheeler();
		jeep.vehicleName = "Hank";
		jeep.vehicleid = 9000;
		System.out.println(jeep.vehicleName + " " + jeep.vehicleid + " " + jeep.noOfWheels);
		Fourwheeler truck = new Fourwheeler();
		truck.vehicleName = "Trap";
		truck.vehicleid = 600;
		System.out.println(truck.vehicleName + " " + truck.vehicleid + " " + truck.noOfWheels);
		Fourwheeler monstertruck = new Fourwheeler();
		monstertruck.vehicleName = "Bob";
		monstertruck.vehicleid = 78;
		System.out.println(monstertruck.vehicleName + " " + monstertruck.vehicleid + monstertruck.noOfWheels);
	}

}
