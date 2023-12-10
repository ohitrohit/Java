package practice_java;

public class EncapslationPractice2 {

	private String name;
	private int salary;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	private void displaywelcomessage() {
		System.out.println(" Welcome in our company , "+ name );
	}
	public void introduce(){
		displaywelcomessage();
		System.out.println(" My company name is  "+ name + " My salary is "+ salary);
	}
	public static void main(String[] args) {
		EncapslationPractice2 ep = new EncapslationPractice2();
		ep.setName("Google");
		ep.setSalary(24000000);
		ep.introduce();
	}
}
