package test.java;

import java.util.*;

public class AddArray {
	
    public static int[] twoSum(int[] nums, int target) {
//        
//    	for (int i=0;i<nums.length;i++) {
//            for(int j=i+1;j<nums.length;j++){
//	            if (nums[j]== target - nums[i] ) {
//	                System.out.println(" The index is :"+i+"/"+j);                                   
//	                return new int[] {i,j};
//	            }   
//            }
//        }
//        return null;     
    	
    	Map<Integer,Integer> map = new HashMap<>();
    	for(int i=0;i<nums.length;i++) {
    		map.put(nums[i], i);    		
    	}
    	System.out.println(map);
    	for(int i=0;i<nums.length;i++) {
    		int bal = target-nums[i];
    		if(map.containsKey(bal) && i != map.get(bal))
    			return new int[] {i,map.get(bal)};
    	}
    	return null;
    }
    
    public static void main(String ar[]) {
    	
    	 //int[] arr= new int[] {3,2,4};
    	 //int[] res = twoSum(arr,6);
     	
   	 	int[] arr= new int[] {2,7,11,15};
   	 	int[] res = twoSum(arr,9);
   	 	//int[] arr= new int[] {3,3};
   	 	//int[] res = twoSum(arr,6);
    	 System.out.println("Index are :");
    	 for(int i : res)
    		 System.out.print(i+" ");
    	 
    }
}