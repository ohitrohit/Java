package practice_java;

class animal{
	public void animal() {
		System.out.println("animal");
	}
}
class dog extends animal{
	public void dog() {
		System.out.println("dog");
	}
}
public class Typecastingpractice2 {

	public static void main(String[] args) {
		animal a = new dog(); // upcasting here we can only fetch the super class properties
		a.animal();
		
		dog d = (dog)a; // downcasting here we can fetch the super and sub class properties
		d.dog();
		d.animal();
	}
}
