package test.scaler;

import java.util.Arrays;

public class SmallerGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[] = {1,2,3,1,2,3,1,2,3,1,2,3};
		int a[] = { 241, 710, 751, 904, 264, 955, 413, 163, 914, 173, 940, 164, 494, 545, 750, 685, 665, 619, 99, 953, 759, 783, 534, 706, 771, 570, 471, 543, 658, 674, 634, 766, 931, 40, 244, 209, 360, 517, 962, 420, 155, 711, 845, 646, 117, 641, 458, 790, 620, 46, 837, 560, 374, 510, 133, 214, 322, 275, 342, 460, 642, 153, 751, 317, 71, 8, 256, 195, 256, 469, 16, 986, 339, 753, 773, 921, 638, 529, 333, 73, 393, 985, 846, 175, 548, 694, 560, 174, 710, 478, 316};
		//int a[] = {947, 871, 859, 471, 763, 766, 379, 746, 485, 966, 10, 350, 341, 22, 706, 702, 717, 967, 641, 712, 10, 954, 751, 250, 777, 214, 820, 276, 708, 509, 123, 73, 593, 790, 797, 678, 320, 865, 392, 428, 611, 813, 655, 195, 102, 902, 919, 171, 706, 841, 873, 98, 128, 728, 878, 701, 874, 158, 548, 214, 414, 600, 869, 936, 841, 221, 87, 255, 233, 627, 487, 53, 270, 162, 517, 576, 240, 681, 172, 148, 86, 778, 205, 741, 483, 11, 795, 188, 450};
		//System.out.println("SmallGreat number is:"+findSmallGreat(a));
		System.out.println("SmallGreat number is:"+findSmallGreatBestApproach(a));
	}
	static int findSmallGreat(int[] a) {
		
		Arrays.sort(a);	
		int len=a.length;
		int firstDup=0,lastDup=0;
		int first = a[0];
		int last = a[len-1];
		
		for (int i=0;i<len;i++) {
			System.out.println(a[i]+" ");
		}
		/*
		 * int duplicate=0; for (int i=0;i<a.length-1;i++) { if(a[i]==a[i+1]) {
		 * duplicate++; } } System.out.println("Duplicate::"+duplicate);
		 */
		
		for(int i=0;i<len;i++) {
			if(first==a[i]) {
				firstDup++;
			}else if(last==a[i]) {
				lastDup++;
			}
		}
		System.out.println("Duplicates:"+firstDup+"/"+lastDup);
		
		return len-2-(firstDup>1 ? firstDup-1 : 0)-(lastDup>1 ? lastDup-1 : 0);
	}
	static int findSmallGreatBestApproach(int[] a) {
		
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		int len = a.length;
		int cnt=0;
		
		for(int i=0;i<len;i++) {
			min = Math.min(a[i], min);
			max = Math.max(a[i], max);			
		}
		System.out.println("minmax:"+min+"/"+max);
		
		for(int i=0;i<len;i++) {
			if(min<a[i] && a[i]<max) {
				cnt++;
			}
		}
		
		return cnt;
	}
}
