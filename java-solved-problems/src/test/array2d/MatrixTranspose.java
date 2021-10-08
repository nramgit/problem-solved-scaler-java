package test.array2d;

public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] A= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		/*int[][] A= {  		{21, 62, 16, 44, 55, 100, 16, 86, 29},          		
							{62, 72, 85, 35, 14, 1, 89, 15, 73},
		            		{42, 44, 30, 56, 25, 52, 61, 23, 54},
		            		{5, 35, 12, 35, 55, 74, 50, 50, 80},
		            		{2, 65, 65, 82, 26, 36, 66, 60, 1},
		            		{18, 1, 16, 91, 42, 11, 72, 97, 35},
		            		{23, 57, 9, 28, 13, 44, 40, 47, 98}
					};*/
		transpose(A);
	}
	static void transposeInplace(int[][] A) {
		
		
		for(int i=0;i<A.length;i++){
			System.out.println(A.length+"="+A[i].length);
	        for(int j=i+1;j<A[i].length;j++){
	            if(i<j){
	            	System.out.println(A[j][i]+" "+A[i][j]);
	        		int t = A[j][i];
	                A[j][i] = A[i][j];
	                A[i][j]= t;
	            }
	        }
		 }
		 System.out.println(A.length+"="+A[0].length);
		 for(int i=0;i<A.length;i++){
			 for(int j=0;j<A[i].length;j++){
				 System.out.print(A[i][j]+ " ");
			 }  	
			 System.out.println("\n");
		 }
	}
	static void transpose(int[][] A) {
		
		int[][] B = new int[A[0].length][A.length];
		 for(int i=0;i<A.length;i++){
			System.out.println(A.length+"="+A[i].length);
	        for(int j=0;j<A[i].length;j++){
	            //if(i<j){
	            	//System.out.println(A[j][i]+" "+A[i][j]);
	        		//int t = A[j][i];
	                B[j][i] = A[i][j];
	                //A[i][j]= t;
	            //}
	        }
		 }
		 System.out.println(B.length+"="+B[0].length);
		 for(int i=0;i<B.length;i++){
			 for(int j=0;j<B[i].length;j++){
				 System.out.print(B[i][j]+ " ");
			 }  	
			 System.out.println("\n");
		 }
	}
}
