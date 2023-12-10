package practice_java;

class sample{
	
	int a = 10;
	static void search() {
		System.out.println("job");
	}
}
class sample2 extends sample{
	void search2() {
		System.out.println("best job");
	}
	
}
public class InheritancePractice {

	public static void main(String[] args) {
		
		sample s= new sample();
		System.out.println(s.a);
		//static method we cant inheritate
		
		System.out.println("=====================================================");
		sample2 s2= new sample2();
		System.out.println(s.a);
		s2.search2();
	}
	
}
