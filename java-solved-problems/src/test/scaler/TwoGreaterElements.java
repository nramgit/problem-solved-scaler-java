package test.scaler;

import java.util.Arrays;

public class TwoGreaterElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] a = {1,2,3,4,5};
		//int[] a = {11,17,100,5};
		int[] a= { 391, 634, 740, 441, 75, 444, 65, 611, 679, 59, 878, 102, 42, 190, 801, 571, 79, 686, 523, 580, 199, 497, 879, 334, 200, 202, 991, 341, 479, 563, 112, 550, 494, 468, 56, 644, 53, 581, 836, 461, 905, 849, 838, 434, 818, 350, 585, 280, 252, 834, 510, 420, 395, 776, 118, 886, 19, 809, 534, 143, 933, 15, 999, 514, 230, 531, 666, 841, 861, 703, 972, 622, 640, 21, 811, 476, 751, 430, 308, 996, 165, 812, 424, 412, 903, 601, 226, 239, 728, 135};
		//int b[] = find2Greater(a);
		int b[] = find2GreaterBestApproach(a);
		for(int i=0;i<b.length;i++) {
			System.out.println(" the result is:"+b[i]);
		}
	}
	static int[] find2Greater(int[] a){
		
		int cnt=0,k=0;
		int[] b = new int[a.length-2]; 
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j] && i!=j) {
					cnt++;
				}
			}
			System.out.println(" count value:"+a[i]+"/"+cnt);
			if(cnt>=2) {
				System.out.println(" atleast 2 greater:"+a[i]);
				b[k++]=a[i];
			}
			cnt=0;
		}
		return b;
	}
	static int[] find2GreaterBestApproach(int[] a) {
		
		int first =  Integer.MIN_VALUE;;
		int second = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>first) {
				second = first;
				first = a[i];
			}else if(a[i]>second) {
				second=a[i];
			}
		}
		int k=0;
		System.out.println(" first & second:"+ first+"/"+second+"/"+a.length);
		int[] b = new int[a.length-2];
		for(int j=0;j<a.length;j++) {
			if(a[j]<second)
				b[k++] = a[j];
		}
		return b;
	}
	
	

}
