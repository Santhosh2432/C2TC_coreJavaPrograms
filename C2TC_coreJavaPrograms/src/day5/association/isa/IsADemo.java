package day5.association.isa;

public class IsADemo {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Dhanush", 101, "IT");
		Manager manager = new Manager("Rock Star", 201, "Hr", 8);

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);
	}

}
