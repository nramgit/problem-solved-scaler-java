package test.scaler;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,4};
		int pos=2;
		//int[] B = rotateArray(A,pos);
		int[] B = rotateArrayWithoutExtraSpace(A,pos);
		for (int i=0;i<B.length;i++) {
			System.out.print(B[i]+" ");
		}
	}
	static int[] rotateArray(int[] A, int pos) {
		
		int[] B=new int[A.length];
		for (int i=0;i<A.length;i++) {
			
			if((i+pos)>=A.length) {
				B[(i+pos)%A.length]=A[i];
			}
			else {				
				B[i+pos]=A[i];
			}
		}
		for (int i=0;i<B.length;i++) {
			System.out.print(B[i]+" ");
		}
		return A; 		
	}
	static int[] rotateArrayWithoutExtraSpace(int[] A, int pos) {
		
		int i=0,j=A.length-1;
		while(i<j) {
			swap(A,i,j);
			i++;j--;			
		}
		int x=0,y=pos-1;
		while(x<y) {
			swap(A,x,y);
			x++;y--;			
		}	
		int l=pos,m=A.length-1;
		while(l<m) {
			swap(A,l,m);			
			l++;m--;			
		}
		return A; 		
	}
	static void swap(int[] A,int a, int b){
		A[a]=A[a]^A[b];
		A[b]=A[a]^A[b];
		A[a]=A[a]^A[b];		
	}
}
