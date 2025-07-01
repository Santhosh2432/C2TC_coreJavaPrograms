package day5.MultilevelInherit.Vechicle;

public class VechicelDemo {

	public static void main(String[] args) {
		Car c;
		c=new Car();
		c.vehicleType();
		
		Buggati m=new Buggati();
		m.vehicleType();
		m.Brand();
		m.Year();
		m.Model();
		
		BuggatiChiron m1=new BuggatiChiron();
		m1.vehicleType();
		m1.Brand();
		m1.Model();
		m1.Year();
		m1.speed();

	}

}
