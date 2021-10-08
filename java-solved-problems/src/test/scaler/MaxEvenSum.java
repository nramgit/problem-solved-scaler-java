package test.scaler;

public class MaxEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {2,3,4,2,4,1};
		System.out.println(		getMaxEvenSum(A));
		
	}
	static int getMaxEvenSum(int[] A) {
		int sum=0;
		for(int i=0;i<A.length;i++) {
			sum+=A[i];
		}
		if(sum%2==0) return sum;
		
		int minOdd=0;
		for(int i=0;i<A.length;i++) {
			if(A[i]%2==1 && (minOdd==0 || A[i]<minOdd)) {
				sum=sum+minOdd;
				sum=sum-A[i];
				minOdd=A[i];
            }
		}
		return sum;
	}

}
