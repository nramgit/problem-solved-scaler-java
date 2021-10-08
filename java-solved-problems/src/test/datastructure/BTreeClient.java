package test.datastructure;

public class BTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree = new BinaryTree();
		tree.insert(20);
		tree.insert(10);
		tree.insert(30);
		tree.insert(50);
		tree.insert(60);
		tree.insert(5);
		
		
		tree.traverseInOrder();
		
		System.out.println(tree.get(10).getData());
		System.out.println(tree.get(50).getData());
		System.out.println(tree.get(100));
		
		System.out.println("The minimum value is :"+tree.min());
		System.out.println("The maximum value is :"+tree.max());
		
		System.out.println("balance tree is :"+tree.isBalancedTree());
		
	}
	

}
