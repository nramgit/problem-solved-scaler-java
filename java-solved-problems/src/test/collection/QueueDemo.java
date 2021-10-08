package test.collection;
import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new PriorityQueue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(30);
		//q.add(null);
		
		System.out.println("Queue contents :"+q.size());
		//System.out.println("Queue contents :"+q.offer());

	}	

}
