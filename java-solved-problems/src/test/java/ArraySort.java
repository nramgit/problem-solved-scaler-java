package test.java;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3, 30, 34, 5, 9};
		int t;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++)
				if(arr[i]<arr[j]) {
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
		}
		System.out.println("Sorted Array");
		
		for(int i:arr)
			System.out.println(i);
	}

}
