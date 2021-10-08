package test.scaler;

import java.util.Arrays;
import java.util.HashMap;

public class TwoNumber {

	public static void main(String[] args) {
		//int[] a = {3, 4, 2, 5, 3, 2, 5, 9, 9,8};
		int[] a = {5,3,2,5,6,2,4,3,8,8};
		//find2Number1(a);
		find2Number2(a);
		
	}
	static void find2Number(int[] a){
		int number=0;
		//for(int i=0;i<a.length;i++) {
		//	number = number^a[i];
		//}
		//System.out.println("The Single number is :"+ number);
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			map.put(a[i], number++);
			if(map.containsKey(a[i])) {
				map.put(null, null);
			}else
				map.put(a[i], null);
			
		}
	}
	static void find2Number1(int[] a){
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i+=2) {
			//System.out.println(a[i]+"/"+a[i+1]);
			if(a[i]!=a[i+1]) {
				System.out.println(a[i]);
				i++;
			}
		}
	}
	static void find2Number2(int[] a) {
		int number=0;
		int pos = 0,n=0;
		int ans1 = 0,ans2=0;
		
		for(int i=0;i<a.length;i++) {
			number = number^a[i];
		}
		System.out.println("XOR single number:"+number);
		
		int i=0;
		while(number>0) {
			//System.out.println((number&1));
			if((number&1)==1)
				pos = i;
			i++;
			number=number>>1;
		}
		
		System.out.println(pos);
		for(int x=0;x<a.length;x++) {
			
			System.out.println(a[i]+"/"+(1<<pos));
			if((a[x]&(1<<pos))!=0){
				ans1 = ans1^a[x];
			}
			else
				ans2 = ans2^a[x];
			}
			
		System.out.println("The two unique number is :"+ ans1 +" "+ ans2);
	}	
}

