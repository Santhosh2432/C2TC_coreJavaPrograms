package day6;

public class Student {
	private String Name;
	private static int ID;
	private  int reg;
	public Student() {
		 ID++;
		 reg++;
	System.out.println("constructor called");
	}
	
	
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public static int getID() {
		return ID;
	}


	public static void setID(int iD) {
		ID = iD;
	}


	public int getReg() {
		return reg;
	}


	public void setReg(int reg) {
		this.reg = reg;
	}


	@Override
	public String toString() {
		return "Student [reg ="+reg+" id ="+ID+" Name =" + Name + "]";
	}
	
}
