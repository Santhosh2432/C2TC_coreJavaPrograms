package day5.MultilevelInherit.Vechicle;

public class Buggati extends Car {
	public Buggati() {
		System.out.println("Buggati SuperCar and SportsCar Brand");
	}
	public void Brand() {
		System.out.println(""
				+ "Brand: Buggati");
	}

	public void Year() {
		System.out.println("Year: 2022");
	}
	public void Model() {
		System.out.println("Model: Chiron");
	}
}
