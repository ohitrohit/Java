package practice_java;

abstract class Rohit{
	abstract void praval();
}
class Rohit2 extends Rohit{
	void praval() {
		System.out.println("hi");
	}
}
public class AbstractClassPractice {

	public static void main(String[] args) {
		Rohit2 r2 = new Rohit2();
		r2.praval();
	}
}
