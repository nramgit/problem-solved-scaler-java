package test.array2d;

public class MatrixDiagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		printMatrixDiagonals(A);
		
	}
	static void printMatrixDiagonals(int[][] A) {
		
		int n=A.length;
		int m=A[0].length;
		
		for(int j=0;j<m;j++) {			
			printDiagonal(0,j,n,m,A);
		}
		for(int i=1;i<n;i++) {			
			printDiagonal(i,m-1,n,m,A);
		}
	}
	static void printDiagonal(int si,int sj,int n,int m, int[][] A) {
		int i=si;
		int j=sj;
		int x=0;
		int y=0;
		int[][] B=new int[n+m-1][n]; 
		//System.out.print(i+" "+j);
		while(i<n && j>=0) {
			//System.out.print(i+","+j+" ");
			//for(int x=0;x<n+m-1;x++) {
				//for(int y=0;y<n;y++) {
					//B[x][y]=A[i][j];
				//}
			//}
			System.out.print(A[i][j]+" ");
			i++;
			j--;
			
			//x++;y++;
		}
		//System.out.println("\n");
		for(int p=0;p<B.length;p++) {
		for(int q=0;q<B[p].length;q++) {
			System.out.print(B[x][y]+" ");
		}
		}
	}
}
