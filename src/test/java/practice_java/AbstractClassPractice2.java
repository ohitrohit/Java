package practice_java;
abstract class Movie{
	abstract void Script();
}
abstract class Buget extends Movie{
	abstract void BigBuget();
}
abstract class Starcast extends Buget{
	abstract void Stars();
	
}
class Release extends Starcast{
	void Script() {
		System.out.println("Script");
	}
	void BigBuget() {
		System.out.println("Buget");
	}
	void Stars() {
		System.out.println("Star");
	}
}
public class AbstractClassPractice2 {

	public static void main(String[] args) {
		Release r = new Release();
		r.Script();
		r.BigBuget();
		r.Stars();
	}
}
