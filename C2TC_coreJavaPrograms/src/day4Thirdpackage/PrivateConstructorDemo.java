package day4Thirdpackage;

public class PrivateConstructorDemo {

	public static void main(String[] args) {
		Myclass m=Myclass.getObject();
		m.setId(2432);
		
		Myclass m1=Myclass.getObject();
		
		System.out.println(m);
		System.out.println(m1);
	}

}
