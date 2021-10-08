package test.datastructure;

public class Stack<X> {
	
	private int MAX=10;
	private int pointer;
	private X [] data;
	
	public Stack() {
		pointer = 0;
		data = (X[]) new Object[MAX];		
	}
	
	public void push(X item) {
		
		if(pointer == MAX)
			throw new IllegalStateException(" stack is full!");
		
		data[pointer++] = item;
		System.out.println(item+ " has been added to the stack!");
		
		System.out.print("Data after add: ");
		display();
	}
	
	public X pop() {
		
		if(pointer<=0)
			throw new IllegalStateException("No more items in the stack!");
		
		X item = data[pointer]; 
		pointer--;
		System.out.println(item+ " has been removed to the stack!");
		
		System.out.print("Data after remove: ");
		display();
		
		return item;		
	}
	
	public boolean isEmpty() {
		return pointer < 0;
	}
	
	public boolean isFull() {
		return (pointer == MAX);		
	}
	
	public int size() {
		return pointer;		
	}
	
	public void display() {
		
		System.out.print("[ ");
		for(int i=0 ; i < pointer ; i++) {
			if(data[i] != null)
				System.out.print(" "+data[i]);
		}		
		System.out.print(" ] \n");
	}
}

