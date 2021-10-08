package test.scaler;

import java.util.Arrays;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {5,1,3,2,4,5,1};
		System.out.println(countDuplicates(A));		
	}
	static int countDuplicates(int[] a) {
		
		Arrays.sort(a);
		int dup=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1])
				dup++;				
		}
		return dup;
	}

}
