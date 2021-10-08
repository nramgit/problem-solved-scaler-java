package test.java;

public class Palindrome {
	public static void main(String ar[]) {
		String A=",a/baa.";
		A=A.replaceAll("\\p{Punct}", "");
		
		System.out.println(""+A);
		int i = isPalindrome(A);
		System.out.println("Palindrome:"+i);	
	}
	
	public static int isPalindrome(String A) {
	        int i=0;
	        int j=A.length()-1;
	        A = A.replaceAll("\\p{Punct}","");
	        while(i<j){
	            if(A.charAt(i)!=A.charAt(j))
	                return 0;
	            i++;
	            j--;
	        }
	        return 1;
	    }
}

