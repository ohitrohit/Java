package practice_java;

public class ConstructorPractice2 {

	String dream_company;
	String dream_pakage;
	
	ConstructorPractice2(String dream_company ,String dream_pakage){
		this.dream_company = dream_company;
		this.dream_pakage = dream_pakage;
	}
		ConstructorPractice2(){
			System.out.println("First dream company");
			dream_company = "Tesla";
			dream_pakage = "2.4 cr";
		}
		
	
	public static void main(String[] args) {
		ConstructorPractice2 cp = new ConstructorPractice2("Google" , "2.4 cr");
		System.out.println(cp.dream_company);
		System.out.println(cp.dream_pakage);
		ConstructorPractice2 cp1 = new ConstructorPractice2();
		System.out.println(cp1.dream_company);
		System.out.println(cp1.dream_pakage);
	}
	
	
}
