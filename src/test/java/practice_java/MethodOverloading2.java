package practice_java;

public class MethodOverloading2 {

	public static void run(String a) {
		System.out.println("Hi");
	}
	public static void run(int a) {
		System.out.println("hi2");
	}
	public static void run(double a) {
		System.out.println("hi3");
	}
	public static void main(String[] args) {
		run(2);
	}
}
