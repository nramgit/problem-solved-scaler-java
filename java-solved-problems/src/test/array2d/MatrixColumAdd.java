package test.array2d;

public class MatrixColumAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A= {{1,2,3},{4,5,6}};
		int[] C = addColumn(A);
		for(int i=0;i<C.length;i++){
			System.out.print(C[i]+" ");
		}
	}
	static int[] addColumn(int[][] A) {		
	
		int[] B = new int[A[0].length];
	    int sum=0;
	    for(int i=0;i<B.length;i++){
	    	sum=0;
	        for(int j=0;j<A.length;j++){	        	
	            sum=sum+A[j][i];	        
	            B[i]=sum;	            
	        }
	    }
	    return B;
	}
}
