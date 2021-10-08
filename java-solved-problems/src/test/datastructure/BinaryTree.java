package test.datastructure;

public class BinaryTree {
	
	Node root;
	
	public void insert(int item) {
		
		if(root== null) 
			root = new Node(item);
		else
			root.insert(item);
	}
	
	public Node get(int item) {
		
		if(root != null)
			return root.get(item);		
		return null;
		
	}
	
	public int min() {
		if(root==null)
			return Integer.MIN_VALUE;
		else
			return root.min();
	}
	
	public int max() {
		if(root==null)
			return Integer.MAX_VALUE;
		else
			return root.max();
	}
	
	public void traverseInOrder() {
		if(root!=null)
			root.traverseInOrder();
	}
	
	public boolean isBalancedTree() {
		
		int lh=0,rh=0;
		
		if(root==null)
			return true;
		
		//lh = height(root.getLeft());
		//rh = height(root.getRight());
		
		if((rh-lh)<=1)
			return true;
		else
			return false;
		
	}
	
	
	
	public int balanceTree() {
		
		if(root==null)
			return 0;
		else
			root.balancedTree();
		
		System.out.println("left & right count:"+root.getLeft().L+"/"+root.getLeft().R);
		return (root.getLeft().L-root.getLeft().R);
	}
	
		
}
