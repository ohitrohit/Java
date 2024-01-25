package practice_java;

import java.util.Scanner;

public class ScannerClassPractice {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("=============================Database===============================");
		System.out.println("Please enter your name");
	    String name = sc.nextLine();
	    
	    System.out.println("Enter your age");
	    int age = sc.nextInt();
	    
	    System.out.println("please enter your mobile number");
	    long mobilenum = sc.nextLong();
	    
	    System.out.println("Please wait your profile is ready");
	    Thread.sleep(5000);
	    System.out.println("Name => "+name);
	    System.out.println("Age => "+age);
	    System.out.println("Mobile Number => "+mobilenum);
	}
}
