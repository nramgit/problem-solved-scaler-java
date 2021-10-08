package test.scaler;

public class SumMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] A= {1,3,4,1};
		int[] A= {-2, 1, -4, 5, 3};
		System.out.println(sumMinMax(A));
	}
	static int sumMinMax(int[] A) {
		
		int min=A[A.length-1];
		int max=A[0];
		
		for(int i=0;i<A.length;i++) {
			if(A[i]>max)
				max = A[i];
			if(A[i]<min)
				min=A[i];
		}
		System.out.println(min+" "+max);
		return min+max;
	}
}
