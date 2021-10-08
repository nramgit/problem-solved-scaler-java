package test.array2d;

public class MatrixProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A= {{1,2},{3,4}};
		int[][] B= {{5,6},{7,8}};
		
		int[][] D=MatrixProduct(A,B);
		for(int i=0;i<D.length;i++){
            for(int j=0;j<D[i].length;j++){
            	System.out.print(D[i][j]+" ");
            }
            System.out.print("\n");
		}
		
	}
	static int[][] MatrixProduct(int[][] A,int[][] B){
		
		int[][] C = new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                C[i][j]=A[i][j]*B[i][j];
            }
        }
        return C;
	}

}
