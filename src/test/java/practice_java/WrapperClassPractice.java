package practice_java;

public class WrapperClassPractice {

	public static void main(String[] args) {
		String a = "420";
		System.out.println(a+5);
		int a2 =Integer.parseInt(a);
		System.out.println(a2+5);
		System.out.println("=============================================");
		
		int a3 = 5;
		System.out.println(a3+5);
		String a4 =String.valueOf(a3);
		System.out.println(a4+5);
		
		System.out.println("================================================");
		
		String a5="10.14";
		double a6 = Double.parseDouble(a5);
		System.out.println(a5+5);
		System.out.println(a6+5);
		
	}
}
