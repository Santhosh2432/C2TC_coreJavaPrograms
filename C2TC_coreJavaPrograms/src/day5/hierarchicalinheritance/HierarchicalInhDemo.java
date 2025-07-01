package day5.hierarchicalinheritance;

public class HierarchicalInhDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Person p;
		p = new Person("Dhanush", "Mumbai");
		if (p instanceof Person)
			System.out.println("Person Details "+p);
		
		p = new Employee("Jai", "chennai", 101, 470000, "Sales");
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		

		p = new Student("Santhosh", "Banglore", "FE", 88);
		if (p instanceof Student)
			System.out.println("Student Details "+p);

	}

}
