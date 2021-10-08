package test.collection;

import java.util.*;
import test.generics.*;


public class HashMapDemo {
	
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		//Emp<> e = new Emp(100);
		
		//map.put(200,"Ramesh");
		//map.put(100,"Mahesh");
		//map.put(250,"Suresh");
		//map.put(120,"Naresh");
		//map.put(200,"Ganesh");
		
		//map.put(new Emp(100), "Ramesh");
		
		System.out.println(""+map.size());
		System.out.println(""+new Integer(120).hashCode());
		
		calculateHash(100);
		calculateHash(120);
		calculateHash(200);
		calculateHash(250);		
		
		//Collections.unmodifiableMap(map);
	}
	static void  calculateHash(int id) {
		int hash = 7;
		System.out.println("Hash: "+(31 * hash + (int) id)/5);
	}
}
