package test.scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeaderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] A = {16, 17, 4, 3, 5, 2};
		ArrayList l = getLeader(Arrays.asList(16, 17, 4, 3, 5, 2));
		System.out.println(l);
	}
	static ArrayList<Integer> getLeader(List<Integer> A){
		
	 
	  int n=A.size();	  
      ArrayList<Integer> list = new ArrayList<>();
      for(int i=0;i<n;i++){
    	  boolean found=false;
          for(int j=i+1;j<n;j++){
              if(A.get(i)<A.get(j))  {
            	  found=true;
            	  break;
              }            	
          }
          if(!found)
        	  list.add(A.get(i));
      }
      return list;
	}
}
