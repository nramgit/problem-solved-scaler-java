package test.scaler;

public class GoodPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,3,2,4,3,5};
		System.out.println(		getGoodPair(A,7));
	}
	static int getGoodPair(int[] A, int sum){
		
		int count=0;
		for(int i=0;i<A.length;i++) {
			for(int j=i+1;j<A.length;j++) {
				if(A[i]+A[j]==sum && i!=j) {
					count++;
				}
			}			
		}
		return count;		
	}
}
