package test.java;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayMaxAdd {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static String largestNumber(final int[] A) {
    	
    	String[] arr = new String[A.length];
        for (int i=0;i<A.length;i++) {
        	arr[i] = String.valueOf(A[i]);            
        }
        Arrays.sort(arr,new Comparator<String>() {
        	public int compare(String a,String b) {
        		System.out.println((b+a)+"="+(a+b)+"/"+(b+a).compareTo(a+b));
        		return (b+a).compareTo(a+b);       		
			}
		});
        StringBuilder sb = new StringBuilder();
        for (String s:arr)
        	sb.append(s);        	
        return sb.toString();        
    }
    
    public static void main(String ar[]) {
    	
    	int[] arr= {3, 30, 34, 5, 9};
    	System.out.println("Maximum sum possible:"+largestNumber(arr));
    }
    
}
/*
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] A) {
        
         String[] arr = new String[A.length];
    for(int i=0; i<A.length; i++){
        arr[i]=String.valueOf(A[i]);
    }
 
    Arrays.sort(arr, new Comparator<String>(){
        public int compare(String a, String b){
            return (b+a).compareTo(a+b);
        }
    });
 
    StringBuilder sb = new StringBuilder();
    for(String s: arr){
        sb.append(s);
    }
 
    while(sb.charAt(0)=='0'&&sb.length()>1)
        sb.deleteCharAt(0);
 
    return sb.toString();

    }
}*/