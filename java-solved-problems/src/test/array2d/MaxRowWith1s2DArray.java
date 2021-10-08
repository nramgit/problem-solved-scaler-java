package test.array2d;

public class MaxRowWith1s2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] A= {{0,0,1},{0,0,1},{1,1,1}};
		//int[][] A= {{0, 0, 1, 1, 1},
		//		  	{0, 0, 0, 1, 1},
		//			{0, 0, 0, 1, 1},
		//			{0, 0, 0, 0, 1},
		//			{0, 0, 0, 1, 1}};
		int[][] A= {	  {0, 0, 0, 0, 0, 1, 1, 1, 1},
				  		  {0, 0, 0, 0, 0, 1, 1, 1, 1},
						  {0, 0, 0, 0, 0, 1, 1, 1, 1},
						  {0, 0, 0, 0, 0, 0, 1, 1, 1},
						  {0, 0, 0, 0, 0, 0, 1, 1, 1},
						  {0, 0, 0, 1, 1, 1, 1, 1, 1},
						  {0, 0, 0, 0, 1, 1, 1, 1, 1},
						  {0, 0, 0, 1, 1, 1, 1, 1, 1},
						  {0, 0, 0, 1, 1, 1, 1, 1, 1}};
		System.out.println(findMaxRowWith1Optimized(A));	

	}
	static int findMaxRowWith1(int[][] A) { //O(N^2)
		
		int max=0;
		int index=0;
		for(int i=0;i<A.length;i++) {
			int count=0;
			for(int j=0;j<A[i].length;j++) {
				if(A[i][j]==1) {
					count++;
				}				
			}
			if(count>max) {
				max=count;
				index++;
			}						
		}
		return index;
	}
	
	static int findMaxRowWith1Optimized(int[][] A) { //O(N)
		
		int index=-1;
		int count=0;
		int max=Integer.MIN_VALUE;
		int i=0;
		int j=A[0].length-1;
		while(i<A.length && j>=0) {
			System.out.println(i+" "+j);
			if(A[i][j]==1) {
				count++;
				j--;				
				if(max<count) {
					System.out.println(max+" "+count+" "+i);
					max=count;
					index=i;
				}
			}else if(A[i][j]==0) {				
				i++;
				//count=0;
			}			
		}		
		return index;
	}

}
