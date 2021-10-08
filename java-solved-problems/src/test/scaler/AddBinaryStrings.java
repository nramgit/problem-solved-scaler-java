package test.scaler;

import java.util.ArrayList;

public class AddBinaryStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="1010110111001101101000",b="1000011011000000111100110";
		//String a="100",b="11";
		double sum=0;
		//System.out.println("Decimal value is:"+0*Math.pow(2, 1));
		
		/*for(int i=0;i<b.length();i++) {
			System.out.println("value:"+(b.charAt(i))+"/"+(b.length()-1-i));
			sum = sum+(Integer.parseInt(String.valueOf(b.charAt(i)))*Math.pow(2, b.length()-1-i));
		}
		System.out.println("Decimal value is:"+sum);
	*/
		
		//System.out.println(" Result:"+(a+b));
		//addBinary(a,b);
		//addBinary1(a,b);
		//addBinary2(a,b);
		addBinary3(a,b);
		
	}
	static void addBinary(String a,String b) {
		
		char x,y;
		int sum=0;
		String s="";
		
		int i=a.length()-1,j=b.length()-1;
		while(i>=0 || j>=0 || sum==1) {
			sum+=(i>=0)?a.charAt(i)-'0':0;
			sum+=(j>=0)?b.charAt(j)-'0':0;	
			s = (char)(sum%2)+'0'+s;
			System.out.println(sum+"/"+s);
			sum=sum/2;
			
			i--;j--;
			System.out.print("result:"+sum);
		}
	
	}
	
	static void addBinary1(String a,String b) {
		
		int z=0,sum=0;
		String s="";
		
		int x = Integer.parseInt(a,2);
		int y = Integer.parseInt(b,2);
		z = x+y;
		
		s = Integer.toBinaryString(z);
		System.out.println("binary String :"+s);
	}
		
	static void addBinary2(String a,String b) {
		
		
		ArrayList<Integer> list = new ArrayList<>();
		String s="";
		int i=0,carry=0;
		long x = Long.parseLong(a);
		long y = Long.parseLong(b);
		while(x!=0 || y!=0) {
			list.add((int)(carry+(x%10+y%10))%2);
			carry=(int)((x%10+y%10+carry)/2);
			x=x/10;
			y=y/10;			
		}
		if(carry!=0)
			list.add(carry);
		System.out.println(list.toString());
		for(int t=list.size()-1;t>=0;t--)
			System.out.print(list.get(t));
	
	}	
	static void addBinary3(String a,String b) {
		
		
		StringBuilder sb = new StringBuilder();
		//String sum="";
		int i=0,carry=0;
		int x = a.length()-1;
		int y = b.length()-1;
		while(x>=0 || y>=0) {
			int sum = carry;
			if(y>=0) sum+=b.charAt(y)-'0';
			if(x>=0) sum+=a.charAt(x)-'0';		
			System.out.println(sum%2);
			sb.append(sum%2);
			carry=sum/2;	
			y--;x--;
		}
		if(carry!=0)
			sb.append(carry);
		System.out.print(sb.reverse());
	
	}	
}
