package test.array;

import java.util.Arrays;

public class ArrayMinDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] A = {1,2,3,4,5};
		//int[] A = {5, 17, 100, 11};
		//int[] A= {37, 19, 71, 72, 5, 4, 74, 2, 30, 33, 85, 1, 7, 14, 98, 27, 51, 7, 24, 88, 86, 81, 77, 64, 13, 3, 63, 75, 29, 50, 90, 3, 22, 94, 40, 72, 75, 26, 32, 64, 62, 59, 19, 16};
		int[] A= {8159, 6718, 8487, 6930, 5208, 554, 4846, 8452, 3606, 5130, 6029, 8673, 6952, 4329, 4611, 5560, 2965, 3170, 6045, 9881, 863, 3884, 827, 9577, 2120, 7877, 8029, 7820, 3132, 8300, 1518, 5730, 2416, 4625, 7562, 1979, 8140, 8888, 4009, 9265, 4045, 3056, 6693, 1988, 3071, 8382, 8360, 382, 8419, 518, 8994, 3819, 1147, 8684, 4170, 25, 1928, 3234, 9803, 7571, 2125, 3612, 7501, 6118, 5956, 7860, 4638, 2668, 1187, 5590, 7173, 2304, 551, 8668, 1321, 8785, 9851, 7720, 2202};
		System.out.println(getMinDiffOptimised1(A));
	}
	static int getMinDiff(int[] A) {
		
		int minDiff=Integer.MAX_VALUE;
		for(int i=0;i<A.length;i++) {
			for(int j=i+1;j<A.length;j++) {
				int diff = Math.abs(A[i]-A[j]);
				if(diff<minDiff)
					minDiff=diff;
			}
		}
		return minDiff;
	}
	static int getMinDiffOptimised(int[] A) {
		
		Arrays.sort(A);
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
		
		int firstMin=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		for(int i=0;i<A.length;i++) {
			if(firstMin>A[i]) {				
				secondMin=firstMin;
				firstMin=A[i];
			} else if(secondMin>A[i]) {
				secondMin=A[i];
			}			
		}
		System.out.println(firstMin+" "+secondMin);
		
		return secondMin-firstMin;
	}
	static int getMinDiffOptimised1(int[] A) {
		
		Arrays.sort(A);						
		int min=Integer.MAX_VALUE;
		for(int i=0;i<A.length-1;i++) {
			int diff = A[i+1]-A[i];			
			if(diff<min) {				
				min=diff;
			}			
		}
		System.out.println(min);
		
		return min;
	}

}
