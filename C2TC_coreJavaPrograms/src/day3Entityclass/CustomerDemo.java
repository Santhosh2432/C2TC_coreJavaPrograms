package day3Entityclass;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer cs=new Customer();
		cs.setCustomerID(128);
		cs.setCustomerName("Santhosh");
		cs.setCity("Chengalpattu");
        System.out.println(cs);
        
        Customer cs1=new Customer();
		cs1.setCustomerID(123);
		cs1.setCustomerName("Dhanush");
		cs1.setCity("Chennai");
        System.out.println(cs1);
        
	}

}
