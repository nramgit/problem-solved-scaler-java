package hack.challenge;

import java.util.*;

public class ListProblem {
	public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int d,q,x,y,z;
	        String[] s =null;
	        ArrayList arr = new ArrayList();

	        for (int i=0;i<n;i++){
            	arr.add(sc.nextInt());
	        }
	        
	        System.out.println("before list =  "+arr);
	        
	        
	        q = sc.nextInt();
	        
	        for (int k = 0;k<q;k++) {
	        	String action = sc.next();
	        	
	        	if(action.equals("Insert")) {	        		
	        		x = sc.nextInt();
	        		y = sc.nextInt();
	        		arr.add(x, y);        		
	        	} else if(action.equals("Delete")) {
	        		z = sc.nextInt();
	        		arr.remove(z);
	        	}
	        	
	        	System.out.println("After list =  "+arr);	        	
	        }
	        	
	    }
}

