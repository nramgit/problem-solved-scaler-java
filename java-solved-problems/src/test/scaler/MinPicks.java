package test.scaler;

import java.util.Arrays;

public class MinPicks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a = {5,17,100,1};
		//int[] a = {0,2,9};
		//int[] a = {5,17,100,1};
		int[] a = {-98, 54, -52, 15, 23, -97, 12, -64, 52, 85};
		//System.out.println(minPick(a));
		System.out.println(minPickBest(a));
		
	}
	static int minPick(int[] a){

		int maxEven = Integer.MIN_VALUE,minOdd = Integer.MIN_VALUE;
		Arrays.sort(a);

		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]%2==0 && a[i]!=0) {
				maxEven=a[i];
				break;
			}
		}
		for(int i=0;i<a.length;i++) {	
			System.out.println("odd mod:"+a[i]%2);
			if(a[i]%2!=0) {
				minOdd=a[i];
				break;
			}
		}
		
		System.out.println("OddEven:"+maxEven+"/"+minOdd);

		return (maxEven-minOdd);
	}
	static int minPickBest(int[] a){

		int maxEven = Integer.MIN_VALUE,minOdd = Integer.MAX_VALUE;		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				maxEven = Math.max(maxEven, a[i]);
			}else {
				minOdd = Math.min(minOdd, a[i]);
			}
		}
		System.out.println("OddEven:"+maxEven+"/"+minOdd);

		return (maxEven-minOdd);
	}
}
