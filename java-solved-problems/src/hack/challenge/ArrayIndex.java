package hack.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIndex {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int search(final List<Integer> A, int B) {
        
//        int[] arr = new int[A.size()];
        //Integer[] arr = A.toArray(new Integer[A.size()]);
        
        for (int i=0;i<A.size();i++){
            if(A.get(i)==B)
                return i;
        }
        return -1;
        
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(2,3,4,5));
		
		int z = search(a,3);
		System.out.println("The index is :"+z);
		
//		
//		Integer[] arr = new Integer[a.size()];
//		Integer[] reverseArr = new Integer[a.size()]; 
//		arr = a.toArray(arr);
//		int j=0;
//		System.out.println("Array elements: ");
//		for(int i=arr.length-1;i>=0;i--) {			
//			reverseArr[j]=arr[i];
//			j++;
//		}		
//		for(int x: reverseArr)
//			System.out.println(x+" ");
//		Arrays.asList(reverseArr);
	}
}