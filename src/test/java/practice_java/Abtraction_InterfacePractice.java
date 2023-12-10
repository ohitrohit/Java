package practice_java;
abstract class Bhago{
	abstract void run();
}
interface Bhaggo2 {
	void run2();
}
public class Abtraction_InterfacePractice extends Bhago implements Bhaggo2{

	void run() {
		System.out.println("BHagggo ---run");
	}
	public void run2() {
		System.out.println("Bhaggo2---run2");
	}
	public static void main(String[] args) {
		Abtraction_InterfacePractice ab = new Abtraction_InterfacePractice();
		ab.run();
		ab.run2();
	}
}
