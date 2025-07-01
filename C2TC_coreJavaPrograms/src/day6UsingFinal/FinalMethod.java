package day6UsingFinal;


	class FinalMethod{
		// constructor
		FinalMethod() {
			System.out.println("This is a default constructor");
		}

		final int a = 50;

		// Final method
		final void show() {
			System.out.println("Value of a: " + a);
		}
	}

