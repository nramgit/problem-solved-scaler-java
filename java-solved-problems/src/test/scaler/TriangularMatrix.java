package test.scaler;

public class TriangularMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] A = {{0,0},{2,0}};
		int[][] A = {{1,0,0},{0,0,0},{-7,-8,9}};
		System.out.println(isTriangularMatrix(A));
	}
	static int isTriangularMatrix(int[][] a) {
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(j>i && a[i][j]!=0)
					return 0;
			}
		}		
		return 1;
	}

}
