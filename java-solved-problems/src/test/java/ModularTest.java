package test.java;

public class ModularTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 2147483647;
		int b = 1;
		int c = 5;
		int d = (a+b)%c;
		int e = ((a%c)+(b%c)%c);
		int f = ((a%c)-(b%c)%c);
		
		
		System.out.println("The add is :"+(a+b));
		System.out.println("The result is :"+d);
		
		System.out.println("The final result1 is :"+e);
		System.out.println("The final result2 is :"+f);
		
		System.out.println("The final result2 is :"+(-8%5));

		System.out.println("The final result2 is :"+(38%12));
		
		System.out.println("The final result2 is :"+Math.pow(25,5));
		System.out.println("The final result2 is :"+Math.pow(25,5)%24);

	}

}
