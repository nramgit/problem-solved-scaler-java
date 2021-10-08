package test.string;

import java.util.Arrays;

public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abdABN";
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		//for (int i=0;i<str.length();i++) {
			//if(str.charAt(i))
		//}
		System.out.println("sorted array:"+new String(arr));
	}

}
