package test.string;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "00011011";
		System.out.println("The possible substrings are: "+maxSubString(str));
	}
	static int maxSubString(String str) {
		int zero=0,one=0,count=0;
		for(int i=0;i<str.length();i++) {
			System.out.println(" Chat At: "+str.charAt(i));
			if(str.charAt(i)=='0'){
				zero++;
			}else {
				one++;
			}	
			if(zero==one)
				count++;
		}
		if(count==0)
			return -1;
		return count;		
	}

}
