package practice_java;
class Steve{
	String name;
	Steve(String name){
		System.out.println("steve");
		this.name = name;
	}
	Steve(){
		System.out.println("dont know");
	}
}

class Ironman extends Steve{
	int love;
	Ironman(int love){
		super("heero");
		System.out.println("Ironman");
		this.love = love;
	}
}
public class InheritancePractice3 {

	public static void main(String[] args) {
		Ironman i = new Ironman(3000);
		System.out.println(i.love);
	}
}
