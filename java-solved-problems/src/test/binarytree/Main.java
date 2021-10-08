package test.binarytree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicBinaryTree<Integer> tree = new BasicBinaryTree<>();
		
		tree.add(10);
		tree.add(20);
		tree.add(5);
		tree.add(25);
		tree.add(8);
		tree.add(3);
		tree.add(15);
		tree.add(45);
		
		tree.Traverse();
		System.out.println("\nIs balanced tree:"+tree.isBalancedTree());
		
		System.out.println("\nIs balanced tree:");
		tree.kthSmallest(3);
		
		System.out.println("\nIs Height of the tree:"+tree.height());
		
		tree.LevelTraverse();
	
	}

}
