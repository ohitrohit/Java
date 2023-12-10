package practice_java;

public class Switch_cases {

	public static void main(String[] args) {
		int a =20;
		int b =5;
		int c;
		int res = 2 ;
		switch(res) {
		case 1 : c = a+b;{
			System.out.println("Addition ="+ c);
		}break;
		case 2 :c = a-b;{
			System.out.println("minus = "+ c);
		}break;
		case 3 : c = a/b;
		{
			System.out.println("divide = "+ c );
		}break;
		case 4 : c = a*b;
		{
			System.out.println("multiple = "+ c);
		}break;
		default : System.out.println("not belong to anyone");{
			
		}break;
		}
		
	}
}
