package practice_java;

class demo{
	String a ;
	demo(){
		a="Steve";
	}
}
class demo2 extends demo{
	String b;
	int c;
	demo2(String b){
		super();
		this.b=b;
	}
	demo2(int c){
		this.c = c;
	}
}
public class InheritancePractice2 {

	public static void main(String[] args) {
		demo2 d = new demo2("Iron man");
		System.out.println(d.b);
		System.out.println(d.a);
		demo2 d2 = new demo2(3000);
		System.out.println(d2.c);
		
	}
}
