package test.scaler;

public class RotateLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,4};
		int pos=2;
		//int[] B = rotateArrayLeft(A,pos);
		int[] B = rotateArrayLeftWithoutExtraSpace(A,pos);
		for (int i=0;i<B.length;i++) {
			System.out.print(B[i]+" ");
		}
	}
	static int[] rotateArrayLeft(int[] A, int pos) {
		
		int[] B = new int[A.length];

		for(int i=0;i<A.length;i++) {
			if((i-pos)<0) 
				B[(i-pos)+A.length]=A[i];
			
			else 
				B[i-pos]=A[i];
			
		}
		return B;
	}
	static int[] rotateArrayLeftWithoutExtraSpace(int[] A, int pos) {
		
		int[] B = new int[A.length];

		for(int i=0;i<A.length;i++) {
			if((i-pos)<0) 
				B[(i-pos)+A.length]=A[i];			
			else 
				B[i-pos]=A[i];			
		}
		
		//int x=0,y=A.length-1;
		//while(x<y) {
		//	swap(A,x,y);
		//}
		return B;
	}
	static void swap(int[] A,int a, int b){
		A[a]=A[a]^A[b];
		A[b]=A[a]^A[b];
		A[a]=A[a]^A[b];		
	}
}
