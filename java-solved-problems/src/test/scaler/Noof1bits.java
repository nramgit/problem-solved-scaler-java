package test.scaler;

public class Noof1bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=16;
		//toBinary(n);
		//toBinary1(n);
		toBinary2(n);
		toBinary3(n);
		//for(int j=a.length-1;j>=0;j--)
		//	System.out.print(a[j]);
	}
	static int[] toBinary(int n) {
		int i=0;
		int a[]= new int[8];
		while(n>0) {
			a[i++]=n%2;
			n = n/2;			
			System.out.println(n%2+"/"+n);
		}
		for(int j=a.length-1;j>=0;j--)
			System.out.print(a[j]);
		return a;
	}
	static void toBinary1(int n) {
		
		int noofbits=0;			
		String s = Integer.toBinaryString(n);
		System.out.print(s.charAt(0));
		for(int j=0;j<s.length();j++) {
			if(s.charAt(j)=='1')
				noofbits++;				
		}
		System.out.print(noofbits);
		//return a;
	}
	
	static void toBinary2(int n) {
		
		int noofbits=0;			
		//String s = Integer.toBinaryString(n);
		while(n>0) {
			if((n&1)==1)
				noofbits++;			
			n = n>>1;
		}
		System.out.println(noofbits);
		//return a;
	}
	static void toBinary3(int n) {
		
		int noofbits=0;			
		while(n>0) {
			n = n&(n-1);
			noofbits++;
		}
		System.out.println(noofbits);
		//return a;
	}

}
