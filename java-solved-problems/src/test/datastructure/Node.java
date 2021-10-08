package test.datastructure;

public class Node {
		
		int L,R;
		private int data;
		private Node left,right;
		
		public Node(int data) {
			super();
			this.data = data;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getLeft() {
			return left;
		}
		public void setLeft(Node left) {
			this.left = left;
		}
		public Node getRight() {
			return right;
		}
		public void setRight(Node right) {
			this.right = right;
		}	
		
		public void insert(int item) {
			
			if(data==item)
				return;
			if(item < data) {
				if(left == null)
					left = new Node(item);
				else
					left.insert(item);
			}
			else {
				if(right == null)
					right = new Node(item);
				else
					right.insert(item);
			}
		}
		
		public Node get(int item) {
			
			if(data==item)
				return this;
			
			if(item < data) {
				if(left != null)
					return left.get(item);
			}
			else {
				if(right != null)
					return right.get(item);				
			}

			return null;
		}
		
		public int min() {
			if(left==null)
				return data;
			else 
				return left.min();
		}
		
		public int max() {
			if(right==null)
				return data;
			else 
				return right.max();
		}
		
		
		public void traverseInOrder() {
			if(left!=null)
				left.traverseInOrder();
			
			System.out.println("Data = "+ data);

			if(right!=null)
				right.traverseInOrder();
		}
		
		public int height(Node node) {
			
			if(left!=null) {
				System.out.println(" Traversing the left node:"+left.data);				
				return left.height(left.getLeft());
			}
			
			if(right!=null) {
				System.out.println(" Traversing the right node:"+right.data);				
				return left.height(right.getRight());
			}
			return 0;
		}
		
		public void balancedTree() {
			
			if(left!=null) {
				System.out.println(" Traversing the left node:"+left.data);
				left.L++;
				left.balancedTree();
			}
			
			if(right!=null) {
				System.out.println(" Traversing the right node:"+right.data);
				right.R++;
				right.balancedTree();
			}
		}
	}