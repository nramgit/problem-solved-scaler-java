package hack.challenge;

import java.util.*;

public class ArrayListProblem {
	public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int d,q,x,y;
	        ArrayList[] arr = new ArrayList[n];
	        
	        for (int i=0;i<n;i++){
	        	d = sc.nextInt();	        			
	            arr[i] = new ArrayList();
	            for(int j=0;j<d;j++) {
	            	arr[i].add(sc.nextInt());
	            }	            
	        }
	        System.out.println("set length =  "+arr.length);
	        System.out.println("set[1] size = "+arr[1].size());
	        
	        q = sc.nextInt();
	        
	        for (int z = 0;z<q;q++) {
	        	x = sc.nextInt();
	        	y = sc.nextInt();
	        	System.out.println("the element is :"+arr[x-1].get(y-1));	        	
	        }
	        	
	    }
}

