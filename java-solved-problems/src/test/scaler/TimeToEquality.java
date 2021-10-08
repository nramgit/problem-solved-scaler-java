package test.scaler;

import java.util.Arrays;

public class TimeToEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {2,3,1,4,6};
		//int[] A= {2,4,1,3,2};
		System.out.println(findTimeEquality(A));
	}
	
	static int findTimeEquality(int[] A){
		
		int max = A[0];
		for(int i=0;i<A.length;i++) {
			if(max<A[i])
				max=A[i];
		}
		//Arrays.sort(A);
		//int max = A[A.length-1];
		int sum=0;
		for(int i=0;i<A.length;i++) {
			int diff = max - A[i];
			sum = sum+diff;
		}
		return sum;
	}
}
