package hack.challenge;

import java.util.*;

public class RotateArray {
	
	public static ArrayList<Integer> rotateArray(List<Integer> a, int B) {
		
		ArrayList<Integer> ret = new ArrayList<Integer>();
		if(B>a.size())
			B=B%a.size();
		for (int i = 0; i < a.size(); i++) {
            if((i + B) >= a.size())
			    ret.add(a.get(i + B-a.size()));
            else 
            	ret.add(a.get(i + B));
		}
		
		return ret;
	}
	
	public static void main(String ar[]) {
		
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(""+rotateArray(a,4));
	}
}
