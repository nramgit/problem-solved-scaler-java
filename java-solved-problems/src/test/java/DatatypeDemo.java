package test.java;

import java.util.Scanner;

public class DatatypeDemo {
public static void main(String arg[]) {
		
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        long l;
        for(int i=0;i<t;i++){
        	try {
	        	l = in.nextLong();
	        	System.out.println(l+ " Can be fitted into ");
	        	if(l>=-128 && l<=127) {
	        		System.out.println(" * byte ");
	        	} else if(l>=-32768 && l<=32767) {
	        		System.out.println(" * byte \n * short");
	        	} else if(l>=-2147483648 && l<=2147483647) {
	        		System.out.println(" * byte \n * short \n * int");
	        	} else if(l>=Long.MIN_VALUE && l<=Long.MAX_VALUE ) {
	        		System.out.println(" * byte \n * short \n * int \n * long");
	        	}
        	} catch (Exception ex) {
        		System.out.println(in.next()+" can't be fitted anywhere...");
        	}
        }
        in.close();
	}

}
