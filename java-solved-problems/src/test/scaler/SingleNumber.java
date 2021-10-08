package test.scaler;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3, 4, 2, 5, 3, 2, 5, 9, 9};
		
		int number=0;
		for(int i=0;i<a.length;i++) {
			number = number^a[i];
		}
		System.out.println("The Single number is :"+ number);
	}

}
