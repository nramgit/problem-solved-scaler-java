package test.scaler;

public class EquilibriumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] A= {-7, 1, 5, 2, -4, 3, 0};
		//int[] A = {1, 2, 3, 7, 1, 2, 3};
		int[] A= {1,2,3};
		System.out.println(getEquilibriumIndex(A));
	}

	static int getEquilibriumIndex(int[] A) {
		
		int n=A.length;
		int[] ps = new int[n];
		ps[0] = A[0];
		for(int i=1;i<n;i++){
		    ps[i]=ps[i-1]+A[i];
		}
		
		for(int i=1;i<n-1;i++) {
		    int leftSum = ps[i-1];
		    int rightSum = ps[n-1]-ps[i];
		    System.out.println(ps[i]+" "+i+" "+leftSum+"="+rightSum);
		    if(leftSum==rightSum)
		        return i;
		}
		return -1;
	}
}