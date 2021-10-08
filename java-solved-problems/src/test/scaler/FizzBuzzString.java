package test.scaler;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		replaceNumber(n);
	}
	static List<String> replaceNumber(int A) {
		
		List<String> strArr = new ArrayList<>();
		for(int i=1;i<=A;i++) {
			if(i%3==0 && i%5==0) 
				strArr.add("FizzBuzz");				
			else if(i%3==0)
				strArr.add("Fizz");				
			else if(i%5==0) 
				strArr.add("Buzz");				
			else
				strArr.add(""+i);
		}		
		System.out.println(strArr);
		return strArr;
	}
}
