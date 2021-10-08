package test.java;

import java.util.Scanner;
import java.util.regex.*;

public class TestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		int i = Integer.parseInt(scan.nextLine());
		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		double d = scan.nextDouble();
		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		String s = scan.nextLine();
		System.out.println("Printing the user input :"+s+"/");
		System.out.println("Printing the user input :"+d+"/");
		System.out.println("Printing the user input :"+i+"/");
		
	}

}
