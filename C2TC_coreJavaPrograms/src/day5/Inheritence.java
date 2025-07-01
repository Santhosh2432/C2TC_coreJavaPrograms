package day5;

import java.util.Scanner;

class Vechicle {
	String Brand;
	int year;
	String model;
	 void Startengine() {
		 
	 }
}
class Car extends Vechicle{
	 int fuelCapacity;
	 void Startengine(int onroad,int offroad) {
		 System.out.println(model+" "+"is an"+" "+Brand+"'s Best Sports Car based on V12 Engine Build in"+" "+year+" " +"with Fuel Capacity of"+" "+fuelCapacity);
		 System.out.println("Price of Car in Offroad"+" "+offroad);
		 System.out.println("price of Car in Onroad"+" "+onroad);
		 int Price=onroad-offroad;
		 System.out.println("Price Difference"+" "+Price);
	 }
	 void drive(int Topspeed){
		 System.out.println("This car's Top speed is "+Topspeed+" powerd with V12 Engine with Twin Turbo it can go 0 to 100 in 5sec");
	 }

}
class Truck extends Vechicle{
	int LoadCapacity;
	void Startengine() {
		System.out.println("Truck engine Starts");
	}
	void haul() {
		System.out.println("Truck is hauling");
	}
}



public class Inheritence{
	
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		
		Car obj= new Car ();
		System.out.println("Enter Car Brand Name");
		obj.Brand=sc.nextLine();
		System.out.println("Enter Year");
		obj.year=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter model Name");
		obj.model=sc.nextLine();
		System.out.println("Enter Fuel Capacity");
		obj.fuelCapacity=sc.nextInt();
		obj.Startengine(120000000,20000000);
		obj.drive(250);
		
	}
}
