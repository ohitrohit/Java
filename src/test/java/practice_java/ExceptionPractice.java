package practice_java;

import java.util.Scanner;

public class ExceptionPractice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the number");
			int upper = sc.nextInt();
			System.out.println("Enter the divident");
			int lower = sc.nextInt();
			System.out.println("Equation ="+upper+"/"+lower);
			int result = upper/lower;
			System.out.println("Result= "+result);
		}catch(Exception e){
			System.out.println("mathmatical error");
		}
	}
}
