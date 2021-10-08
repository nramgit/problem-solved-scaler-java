package test.streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(60);
		list.add(30);
		list.add(20);
		list.add(40);
	
		System.out.println("List contents: "+list);
		
		List<Integer> list1 = list.stream().filter(k->k>20).collect(Collectors.toList());
		System.out.println("List contents after filter: "+list1);
		
		long cnt = list.stream().filter(k->k>20).count();
		System.out.println("count of list after filter: "+cnt);
		
		List<Integer> list2 = list.stream().map(k->k*5).collect(Collectors.toList());
		System.out.println("List contents after map: "+list2);
		
		List<Integer> list3 = list.stream().sorted().collect(Collectors.toList());
		System.out.println("List contents after sorting: "+list3);
		
		List<Integer> list4 = list.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println("List contents after custom sorting: "+list4);
	
	}

}
