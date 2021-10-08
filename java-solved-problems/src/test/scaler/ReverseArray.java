package test.scaler;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] A = {1,2,3,4,5};
		int[] A = {10,1,1};
		int[] B = reverseArray(A);
		for(int i=0;i<B.length;i++)
			System.out.print(B[i]+" ");
	}
	static int[] reverseArray(int[] A) { //O(N) S(N)
		int i=0,j=A.length-1;
		while(i<j) {
			//swap(A[i],A[j]);
			A[i]=A[i]^A[j];
			A[j]=A[i]^A[j];
			A[i]=A[i]^A[j];
			i++;
			j--;
		}
		return A;
	}
	static void swap(int a,int b){
		a = a^b;
		b = b^a;
		a = a^b;		
	}
	static int[] reverseArrayWithoutExtraspace(int[] A) { //O(N) S(1)
		int i=0,j=A.length-1;
		while(i<j) {
			//swap(A[i],A[j]);
			A[i]=A[i]^A[j];
			A[j]=A[i]^A[j];
			A[i]=A[i]^A[j];
			i++;
			j--;
		}
		return A;
	}
}
