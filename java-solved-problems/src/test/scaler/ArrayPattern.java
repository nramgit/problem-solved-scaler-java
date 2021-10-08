package test.scaler;

public class ArrayPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		
		int[][] arr2d = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if(i<j)
					arr2d[i][j] = 0;
				else
					arr2d[i][j] = j+1;
			}
		}
		
		for(int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
