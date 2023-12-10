package practice_java;

public class MethodPractice5 {

	
	public static void main(String[] args) {
		
		System.out.println("main method");
		//non static method
		MethodPractice4 d = new MethodPractice4();
		d.data();
		//static method
		MethodPractice4.nibbi();
	}
}
