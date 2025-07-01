package day6StaticBlockMethod;

public class MyclassDemo {
	public static void main(String[] args) {
	MyClass o1 = new MyClass();
	System.out.println(o1);

	
	MyClass.display();

	MyClass o2 = new MyClass();
	System.out.println(o2);
	MyClass.display( );
	MyClass o3 = new MyClass();
	System.out.println(o3);
	MyClass.display();
	}
	
}
