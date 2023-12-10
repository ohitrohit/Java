package practice_java;

public class MethodOverloading {

	

	    // Method with two int parameters
	    public int add(int a, int b) {
	        return a + b;
	    }

	    // Method with three int parameters
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    // Method with two double parameters
	    public double add(double a, double b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	    	MethodOverloading calculator = new MethodOverloading();

	        System.out.println("Sum of two ints: " + calculator.add(5, 10));
	        System.out.println("Sum of three ints: " + calculator.add(5, 10, 15));
	        System.out.println("Sum of two doubles: " + calculator.add(3.5, 7.5));
	    }
	

}
