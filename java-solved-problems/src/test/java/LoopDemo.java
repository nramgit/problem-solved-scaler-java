package test.java;

import java.util.Scanner;

public class LoopDemo {
	public static void main(String a[]) {
		
		//int N=2;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i=1;i<=10;i++) {
			System.out.printf("%d x % d = %d\n",N, i, N*i);
		}
		sc.close();
	}

}
