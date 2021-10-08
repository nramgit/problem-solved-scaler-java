package test.java;

import java.util.*;

public class AddArrayIndex {
	
    public static int[] twoSumIndex(int[] nums) {
        
    	for (int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++){
            	for(int k=j+1;k<nums.length;k++){
            		for(int l=k+1;l<nums.length;l++){
            			if (nums[i]+nums[j] == nums[k]+nums[l] && i<j && k<l ) {
            				System.out.println(" The index is :"+i+"/"+j+"/"+k+"/"+l);                                   
        	                return new int[] {i,j,k,l};
            			}
            		}
            	}
            }
        }
        return null;     
    	
//    	Map<Integer,Integer> map = new HashMap<>();
//    	for(int i=0;i<nums.length;i++) {
//    		map.put(nums[i], i);    		
//    	}
//    	System.out.println(map);
//    	for(int i=0;i<nums.length;i++) {
//    		int bal = nums[i];
//    		if(map.containsKey(bal) && i != map.get(bal))
//    			return new int[] {i,map.get(bal)};
//    	}
//    	return null;
    }
    
    public static void main(String ar[]) {
    	
    	 //int[] arr= new int[] {3,2,4};
    	 //int[] res = twoSum(arr,6);
     	
   	 	//int[] arr= new int[] {2,7,11,15};
    	int[] arr= new int[] {3,4,7,1,2,9,8};
   	 	int[] res = twoSumIndex(arr);
   	 	//int[] arr= new int[] {3,3};
   	 	//int[] res = twoSum(arr,6);
    	 System.out.println("Index are :");
    	 for(int i : res)
    		 System.out.print(i+" ");
    	 
    }
}