package test.scaler.carryforward;

public class ArrayCarryForward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = {{1,2,10},{2,3,20},{2,5,25}};
		int res[] = carryForward(5,A);
		for(int i=0;i<res.length;i++){
			System.out.println(res[i]);
		}
	}
	static int[] carryForward(int A,int[][] B) {
		
		int[] result = new int[A];
	    for(int i=0;i<B.length;i++){
	        int[] C = B[i];
	        int s=C[0]-1;
	        int e=C[1]-1;
	        int val = C[2];
	        for(int j=s;j<=e;j++){	        	
	            result[j]=result[j]+val;
	            System.out.println(j+" "+result[j]+" "+val);
	        }
	    }
	    return result;
	}
}
