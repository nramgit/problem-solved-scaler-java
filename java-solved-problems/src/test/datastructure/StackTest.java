package test.datastructure;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		System.out.println("Size of the stack ==> "+stack.size());
		
		stack.push("10");
				
		System.out.println("Stack Elements ==> ");
		stack.display();
		System.out.println("Stack Size after push==> "+stack.size());
		
		stack.push("20");
		System.out.println("Stack Elements ==> ");
		stack.display();
		System.out.println("Stack Size after push==> "+stack.size());
		
		stack.pop();
		System.out.println("Stack Elements ==> ");
		stack.display();
		System.out.println("Stack Size after pop==> "+stack.size());
		stack.display();
		
	}

}
