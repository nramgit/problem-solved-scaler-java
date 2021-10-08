package test.scaler;

public class LowerTrianglePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=4;
		int[][] B=new int[A][A];
		
        for(int i=0;i<A;i++){
            for(int j=0;j<A;j++){
                if(j>i)
                    B[i][j]=0;
                else
                    B[i][j]=j+1;
            }
        }
        for(int i=0;i<A;i++){
            for(int j=0;j<A;j++){
            	System.out.print(B[i][j]+" ");
            }
            System.out.print("\n");
        }
	}

}
