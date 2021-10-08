package test.java;

import java.util.Scanner;

public class TestProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int val = sc.nextInt();
			System.out.println(val%A);
			if(val%A==0) {
				
			}
		}
	}

}
