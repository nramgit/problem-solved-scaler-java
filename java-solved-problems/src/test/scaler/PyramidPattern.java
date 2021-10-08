package test.scaler;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPyramidPattern(8);
	}
	static void printPyramidPattern(int n) {
		String space=" ";
	    for(int i=n;i>0;i--){
	        for(int j=i;j>0;j--){
	            System.out.print("*"+space);
	        }	       
	        System.out.print("\n");
	        for(int k=n-i;k>=0;k--){
	        	System.out.print(space);
	        }
	    }
	}
}
