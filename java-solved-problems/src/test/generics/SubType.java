package test.generics;

import java.util.*;

public class SubType {
	
	public static void main(String a[]) {
		Object o = new Object();
		int i=10;		
		o=i;
		
		List<Number> list = new ArrayList<>();		
		list.add(10);
		list.add(10.5);		
	}
}

