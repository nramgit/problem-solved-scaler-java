package test.scaler;

public class IdentityArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A= {{1,0,0},{0,1,0},{1,0,1}}; 
		System.out.println(isIdentity(A));
	}
	static int isIdentity(int[][] A) {
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A.length;j++) {
				if(i==j && A[i][j]!=1) {
					return 0;
				}				
			}
		}
		return 1;
	}
}
