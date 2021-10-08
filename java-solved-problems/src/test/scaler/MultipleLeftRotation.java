package test.scaler;

public class MultipleLeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,4,5};
		int[] B = {2,3};
		int[][] C = rotateArray(A,B);
		for (int i=0;i<C.length;i++) {
			System.out.print("\n");
			for (int j=0;j<C[i].length;j++) {
				System.out.print(C[i][j]+" ");
			}
		}
	}
	static int[][] rotateArray(int[] A, int[] B) {
		
		int[][] C = new int[B.length][A.length];
		
		for(int pos=0;pos<B.length;pos++) {
			for(int i=0;i<A.length;i++) {
				System.out.println(pos+" "+i+" "+(i-B[pos])+" "+((i-B[pos])+A.length)+" "+A[i]);
				if((i-B[pos])<0) 
					C[pos][((i-B[pos])+A.length)]=A[i];			
				else 
					C[pos][i-B[pos]]=A[i];			
			}
		}
		return C;
	}
	

}
