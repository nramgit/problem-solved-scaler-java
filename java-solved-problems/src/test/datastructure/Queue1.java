package test.datastructure;

import java.util.Queue;

public class Queue1<X> {
	
	private int MAX=10;
	private int front;
	private int end;
	private X [] data;
	
	public Queue1() {
		front = -1;
		end = -1;
		data = (X[]) new Object[MAX];		
	}
	
	public void enqueue(X item) {
		
		if(isFull()) {
			throw new IllegalStateException(" Queue is full!");
		}
		else if(front == -1 && end == -1) {			
			front++;
			end++;		
			data[end] = item;
			
		} else {
			end++;
			data[end] = item;
		}
		
		System.out.println(item+ " has been added to the queue!");
		System.out.print("Data after add: ");
		display();
	}
	
	public X dequeue() {
		X item;
		if(isEmpty())
			throw new IllegalStateException("No more items in the queue!");
		
		if(front==end) {		
			item = data[end];
			data[end]=null;
			front=-1;
			end=-1;		
		}
		else {			
			item = data[front];
			data[front]=null;
			front++;	
		}	
	
		System.out.println(item+ " has been removed to the queue!");
		
		System.out.print("Data after remove: ");
		display();
		
		return item;		
	}
	
	public boolean isEmpty() {
		return (size() <= 0);
	}
	
	public boolean isFull() {
		return (size() == MAX);		
	}
	
	public int size() {
		if(front == -1 && end == -1) {
			return 0;
		}else {
			return end-front+1;
		}
	}
	
	public void display() {
		
		System.out.print("[ ");
		for(int i=front ; i < end+1 ; i++) {
			if(data[i] != null)
				System.out.print(" "+data[i]);
		}		
		System.out.print(" ] \n");
	}
}
