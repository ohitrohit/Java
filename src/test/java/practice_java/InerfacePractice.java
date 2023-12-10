package practice_java;
interface A{
	void a();
	abstract void Hur();
}
class B implements A{

	public void a() {
		
		System.out.println("a");
	}
	public void Hur() {
		System.out.println("hur");
	}
	
}
public class InerfacePractice {

	public static void main(String[] args) {
		B b2 = new B();
		b2.a();
		b2.Hur();
	}
}
