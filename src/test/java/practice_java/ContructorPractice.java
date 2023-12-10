package practice_java;

public class ContructorPractice {

	int a ;
	int b ;
	 ContructorPractice(){
		  a = 100;
		  b = 50;
		 
	 }
	public static void main(String[] args) {
		ContructorPractice cp = new ContructorPractice();
		System.out.println(cp.a);
		System.out.println(cp.b);
		
	}
}
