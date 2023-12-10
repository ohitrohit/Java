package practice_java;

public class Constructorpractice3 {

	String name;
	Constructorpractice3(){
		System.out.println("1st");
	}
	Constructorpractice3(int a){
		this();
		a = 10;
		System.out.println("2nd ="+a);
	}
	Constructorpractice3(String name){
		this(2);
		this.name = name;
		System.out.println("3rd");
	}
	public static void main(String[] args) {
		Constructorpractice3 cp = new Constructorpractice3("rohit");
		System.out.println(cp.name);
	}
}
