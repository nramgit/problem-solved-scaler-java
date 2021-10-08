package hack.challenge;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		long start = System.currentTimeMillis();
		System.out.println("Fibonacci series: "+findFibonacci(n));
		long end = System.currentTimeMillis();
		System.out.println("time taken total:"+start+"/"+end+"/"+(end-start));
	}
	static int findFibonacci(int n) {
		
		if(n<=1)
			return n;
		else 
			return findFibonacci(n-1)+findFibonacci(n-2);
	}
	
//	static int[] f = new int[100];
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc =  new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		
//		for(int i=0;i<f.length;i++)
//			f[i]=-1;
//		
//		System.out.println("Fibonacci series: "+findFibonacci(n));
//	}
//	
//	static int findFibonacci(int n) {
//	
//		if(f[n]!=-1)
//			return f[n];
//		
//		if(n<=1)
//			return n;
//		else 
//			return findFibonacci(n-1)+findFibonacci(n-2);
//	}

}
