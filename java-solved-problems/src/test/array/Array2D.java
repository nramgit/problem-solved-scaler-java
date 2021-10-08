package test.array;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {{1,2},{3,4}};
		
		disp(arr);
	}
	static void disp(int arr[][]) {
		
	
		int row = arr.length;
		int column = arr[0].length;
		int[][] arr1= new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=row-1;j>=0;j--) {
				System.out.println(arr[j][i]);
			}
		}
		
	}

}
