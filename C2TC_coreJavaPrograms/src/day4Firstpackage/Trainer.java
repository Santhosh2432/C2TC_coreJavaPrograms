package day4Firstpackage;

public class Trainer extends Person {
	private String designation;
	private String location;
	public Trainer() {
		super();
		this.designation="program trainer";
		this.location="Chennai";
		}
	public Trainer (int id,String name,String city,String designation,String location) {
		super(id,name,city);
		this.designation=designation;
		this.location=location;
	}
	public String getDesigtation() {
		return designation;
	}
	public void setDesigtation(String desigtation) {
		this.designation = desigtation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		location = location;
	}
	@Override
	public String toString() {
		return "Trainer [id:"+getId()+" Name:"+getName()+" city: "+getCity()+" designation=" + designation + ", location=" + location + "]";
	}
	
}
