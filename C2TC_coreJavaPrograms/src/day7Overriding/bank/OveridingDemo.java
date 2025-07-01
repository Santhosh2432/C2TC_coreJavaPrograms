package day7Overriding.bank;

public class OveridingDemo {

	public static void main(String[] args) {
		RBI rbi;


		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new ICIC();
		System.out.println(rbi.getRateOfInterest());

		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());

	}

}
