package test.scaler.subarray;

public class LeastAvgSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] A= {3, 7, 90, 20, 10, 50, 40}; //3
		//int[] A = { 20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11}; //9
		int[] A = {5, 15, 7, 6, 3, 4, 18, 14, 13, 7, 3, 7, 2, 18}; //6
		//int[] A = {15, 7, 11, 7, 9, 8, 18, 1, 16, 18, 6, 1, 1, 4, 18};		
		//System.out.println(getLeastAvgSubArray(A,9));
		System.out.println(getLeastAvgSubArraySlidingWindow(A,6));
		
	}
	static int getLeastAvgSubArray(int[] A, int B) {
		
		 int startIndex=0;
	     int minAvg = Integer.MAX_VALUE;
	     for(int i=0;i<=A.length-B;i++){
	         int s = i;
	         int e = B+i-1;
	         int sum=0;
	        
	         for(int j=s;j<=e;j++){
	             sum = sum+A[j];
	             System.out.println(s+" "+e+" "+sum+" "+A[j]+" "+(sum/B));
	         }
	         
	         if(sum<minAvg){
	             minAvg=sum;
	             startIndex=s;
	         }
	     }
	     return startIndex;
	}
	static int getLeastAvgSubArraySlidingWindow(int[] A, int B) {
		
		int sum=0;
		int startIndex=0;
		for(int i=0;i<B;i++){
			sum=sum+A[i];
		}
		int minSum=sum;
		
		for(int i=1;i<=A.length-B;i++) {
			sum=sum-A[i-1]+A[i+B-1];
			if(sum<minSum){
				minSum=sum;
	            startIndex=i;	            
	        }
		}
		return startIndex;			
	
	}
}
