package test.streams;

import java.util.*;
import java.util.stream.Collectors;

public class ParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		for (int i=0;i<100;i++) {
			list.add(new Employee(100, "John",10000));
			list.add(new Employee(100, "John",20000));
			list.add(new Employee(100, "John",30000));
			list.add(new Employee(100, "John",60000));
			list.add(new Employee(100, "John",20000));
			list.add(new Employee(100, "John",50000));
		}
		
		long begin = System.currentTimeMillis();
		long l1 = list.stream().filter(e1->e1.getSal()>30000).count();
		long end = System.currentTimeMillis();
		System.out.println("Time taken for seq stream====>"+l1+"/"+(end-begin));
	
		long begin1 = System.currentTimeMillis();
		long l2 = list.parallelStream().filter(e1->e1.getSal()>30000).count();
		long end1 = System.currentTimeMillis();
		System.out.println("Time taken for seq stream====>"+l2+"/"+(end1-begin1));
		
	
	}

}
