package hack.challenge;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,4,2,5,4,5};
		//System.out.println("Do we have duplicates:"+findDuplicate(a));
		System.out.println("Do we have duplicates:"+findDuplicateWithMinTime(a));
	}
	
	static boolean findDuplicate(int[] x){
		
		boolean found=false;
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if(x[i]==x[j]) {
					System.out.println("the duplicate number is"+x[i]);
					found=true;
				}
			}			
		}
		return found;
	}
	
	static boolean findDuplicateWithMinTime(int[] x){
		
		boolean found=false;
		for(int i=0;i<x.length;i++) {
			
			if(x[Math.abs(x[i])]>0)
				x[Math.abs(x[i])] = -x[Math.abs(x[i])];
			else
				System.out.println("the duplicate number is"+Math.abs(x[i]));
		}
		return found;
	}
}


