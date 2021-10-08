package test.scaler.subarray;

public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] A= {1,2,3};
		int[] A= {1,2,3,4};
		//sumSubArray(A);
		System.out.println(sumSubArrayOptimised1(A));
	}

	static long sumSubArray(int[] A){
	
		long sum=0;
		for(int i=0;i<A.length;i++){
		    for(int j=i;j<A.length;j++){
		        for(int k=i;k<=j;k++){
		            sum = sum+A[k];
		        }
		        System.out.println(sum);
		    }
		}
		return sum;
	}
	static long sumSubArrayOptimised(int[] A){
		
		int sum=0;	
		int maxSum=Integer.MIN_VALUE;
		for(int s=0;s<A.length;s++){
			sum=0;	
		    for(int e=s;e<A.length;e++){
	            sum = sum+A[e];
		        System.out.println("sum:"+sum);
		        if(sum>maxSum)
			    	maxSum=sum;
		    }
		    System.out.println(sum+" "+maxSum);
		    
		}
		System.out.println("MaxSum:"+maxSum);
		return maxSum;
	}
	static long sumSubArrayOptimised1(int[] A){
		long sum=0;
		for(int i=0;i<A.length;i++) {
			int s=i+1;
			int e=A.length-i;
			sum=sum+A[i]*(s*e);
		}
		return sum;
	}
	
}