package practice_java;

public class ConstructorPractice {

	int salary;
	String name;
	String company;
	ConstructorPractice(int a , String b , String c){
		System.out.println("hi");
		salary = a;
		name = b ;
		company = c;
		
	}
	public static void main(String[] args) {
	   System.out.println("hi2");
	   ConstructorPractice cp = new ConstructorPractice(30812 , "Rohit" , "Sigmont");
	   System.out.println(cp.name);
	   System.out.println(cp.company);
	   System.out.println(cp.salary);
	}
}
