package practice_java;

public class StringClassPrcatice {

	public static void main(String[] args) {
		String name = "rohit";
		System.out.println(name.charAt(2));
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		String[] n = name.split("o");
		
		for(String n2 :n) {
			System.out.println(n2);
		}
	}
}
