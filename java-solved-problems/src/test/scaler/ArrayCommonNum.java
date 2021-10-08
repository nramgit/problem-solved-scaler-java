package test.scaler;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCommonNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> A = new ArrayList<>(2,3,4);
		//int[] A = {2,3,4};
		int[] B = {3,4,5};
		//System.out.println(getArrayCommon(Arrays.asList(A),Arrays.asList(B)));
	}
	static ArrayList<Integer> getArrayCommon(ArrayList<Integer> A,ArrayList<Integer> B) {
		int sum=0;
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0;i<A.size();i++) {
			if(B.contains(A.get(i))) {
				arr.add(A.get(i));
				B.remove(A.get(i));
			}				
		}	
		return arr;
	}

}
