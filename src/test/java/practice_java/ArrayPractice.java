package practice_java;

public class ArrayPractice {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,8};
		for(int i = 0; i<a.length; i++) {
			System.out.println(i+" value = "+a[i]);
			
		}
		
		String[] name = {"rohit","rahul","mohit","kalla","nitin"};
		for(int i =0; i<name.length; i++) {
			System.out.println("data= "+name[2]);
			System.out.println("Length of array= "+name.length);
			break;
		}
	}
}
