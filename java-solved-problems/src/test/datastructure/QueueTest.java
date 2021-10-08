package test.datastructure;

public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue1 q = new Queue1();
		System.out.println("Size of the stack ==> "+q.size());
		System.out.println("Is stack empty ==> "+q.isEmpty());
		System.out.println("Is stack full ==> "+q.isFull());
		q.enqueue(10);
				
		//System.out.println("Queue Elements ==> ");
		//q.display();
		System.out.println("Queue Size after push==> "+q.size());
		System.out.println("Is stack empty ==> "+q.isEmpty());
		System.out.println("Is stack full ==> "+q.isFull());
		q.enqueue(20);
		q.enqueue(70);
		//System.out.println("Queue Elements ==> ");
		//q.display();
		System.out.println("Queue Size after push==> "+q.size());
		
		q.dequeue();
		//System.out.println("Queue Elements ==> ");
		//q.display();
		System.out.println("Queue Size after pop==> "+q.size());
		//q.display();
		q.dequeue();
		System.out.println("Is stack empty ==> "+q.isEmpty());
		System.out.println("Is stack full ==> "+q.isFull());
		q.dequeue();
		q.enqueue(30);
		//System.out.println("Queue Elements ==> ");
		//q.display();
		q.enqueue(40);
		q.dequeue();
		System.out.println("Queue Size after pop==> "+q.size());
		q.dequeue();
		//System.out.println("Queue Elements ==> ");
		//q.display();	
		System.out.println("Queue Size after pop==> "+q.size());
		q.dequeue();
		System.out.println("Queue Size after pop==> "+q.size());
		q.dequeue();
		q.dequeue();
		q.dequeue();
		System.out.println("Queue Size after pop==> "+q.size());
		q.dequeue();
	}

}
