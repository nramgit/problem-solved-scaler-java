package test.scaler;

import java.util.Scanner;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A=null;
		int even=0,odd=0;
		Scanner sc =  new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++) {
			int n = sc.nextInt();
			A = new int[n];
			for(int j=0;j<n;j++) {
				A[j] = sc.nextInt();		
				if((A[j]&1)==1)
					odd++;
				else
					even++;
			}
			System.out.println("Array sum:"+Math.abs(even-odd));
		}
		sc.close();
		/*for(int k=0;k<A.length;k++) {
			if((A[k]&1)==1)
				odd++;
			else
				even++;
		}
		System.out.println("Array sum:"+Math.abs(even-odd));*/
	}

}
