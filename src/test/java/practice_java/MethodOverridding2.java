package practice_java;

class love {
	public static void Hero() {
		System.out.println("Hi");
	}
}
class Love2{
	public static void Hero() {
		System.out.println("bye");
	}
}
public class MethodOverridding2 {

	public static void main(String[] args) {
		Love2 l = new Love2();
		l.Hero();
	}
}
