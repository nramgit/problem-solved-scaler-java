package test.binarytree;

import java.util.Comparator;

public class BasicBinaryTree<X extends Comparable<X>> {
	
	Node root;	
	int c=0;
	
	public BasicBinaryTree() {
		super();
		root=null;
	}
	
	public void Traverse() {
		
		System.out.print("Data :");
		
		if(root!=null)	{
			Traverse(root);
		}
	}
	public void Traverse(Node parent) {
		
		if(parent.getLeft()!=null) {	
			//System.out.println("Left node:"+parent.getLeft().getItem());
			Traverse(parent.getLeft());
		}
		System.out.print(" "+parent.getItem());
		if(parent.getRight()!=null) {
			//System.out.println("Right node:"+parent.getRight().getItem());
			Traverse(parent.getRight());
		}
	}
	
	public void LevelTraverse() {
		
		int h = height(root);
		
		for(int i=1;i<=h;i++)
			printLevelOrder(root,i);
		/*
		if(parent.getLeft()!=null) {	
			//System.out.println("Left node:"+parent.getLeft().getItem());
			Traverse(parent.getLeft());
		}
		System.out.print(" "+parent.getItem());
		if(parent.getRight()!=null) {
			//System.out.println("Right node:"+parent.getRight().getItem());
			Traverse(parent.getRight());
		}*/
	}
	
	private void printLevelOrder(Node node,int i) {
		
		if (node==null)
			return;
		if(i==1)
			System.out.print(node.getItem()+" ");
		else if(i>1) {
			printLevelOrder(node.getLeft(),i-1);
			printLevelOrder(node.getRight(),i-1);
		}
			
	}
	
	public int height() {
		return height(root);
	}
	public int height(Node root) {
		
		int l=0,r=0;		
		if(root==null)
			return 0;
		if(root.left!=null)
			l=1+height(root.left);
		if(root.right!=null)
			r= 1+height(root.right);
		
		return l<r? r: l;
	}
	
	public boolean isBalancedTree() {		
				
		int i = isBalancedTree(root);
		System.out.println("the value if i:"+i);
		if(i>1) return false;
		else return true;		
	}
	
	private int isBalancedTree(Node parent) {
		
		int l=0,r=0;		
		if(root==null)
			return 0;
		if(root.left!=null)
			l=1+height(root.left);
		if(root.right!=null)
			r= 1+height(root.right);
		System.out.println("Left & Right "+l+"/"+r);
		return Math.abs(l-r);
		
		/*if(parent!=null)
		System.out.println("the item value:"+parent.getItem());
		if(parent==null)
			return 0;
		
		int l = isBalancedTree(parent.getLeft());
		if(l==-1) return -1;
		
		int r = isBalancedTree(parent.getRight());
		if(r==-1) return -1;
				
		System.out.println("the value of l & r:"+l+"/"+r);
		if(Math.abs(l-r)>1) return -1;
		
		return (Math.max(l, r)+1);
		*/
	}
	
	/*public void kthSmallest(int k) {
		System.out.println(kthSmallest(root,k));
	}
	
	public Node kthSmallest(Node root, int k) {
	     
        int n = treeSize(root)+1;
       
        if(n==k) return root;
            
        if(n>k) return kthSmallest(root.getLeft(),k);
            
        if(n<k) return kthSmallest(root.getRight(),k-n);
        
        return null;
    }*/
    
	public int kthSmallest(int k) {
		System.out.println();
		if(root==null)
			return -1;
		return kthSmallest(root,k);
	}
	
	int kthSmallest(Node parent, int k) {
		
			if(parent.getLeft()!=null) {	
				Traverse(parent.getLeft());
			}
			c++;
			if(c==k)
				//return parent.getItem(); 
			
			if(parent.getRight()!=null) {
				Traverse(parent.getRight());
			}		
			return -1;
	}
	
    int treeSize(Node parent){
        
        if(parent==null)
            return 0;
        return (treeSize(parent.left)+treeSize(parent.right)+1);
    }
	
	public void add(X item) {
		
		Node node = new Node(item);
		
		if(root==null)
			root = node;
		else
			insert(root,node);
	}
	
	private void insert(Node parent,Node child) {
		
		if(child.getItem().compareTo(parent.getItem())<0) {
			if(parent.getLeft()==null) {
				parent.setLeft(child);
				child.setParent(parent);
			}
			else {
				insert(parent.getLeft(),child);
			}
			
		}else if(child.getItem().compareTo(parent.getItem())>0) {
			if(parent.getRight()==null) {
				parent.setRight(child);
				child.setParent(parent);
			}
			else {
				insert(parent.getRight(),child);
			}
		}
	}

	private class Node{
		
		private X item;
		private int h;
		private Node left;
		private Node right;
		private Node parent;
		
		public Node(X item) {
			this.item = item;
			left = null;
			right = null;
			parent = null;
		}
		public X getItem() {
			return item;
		}
		public void setItem(X item) {
			this.item = item;
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
		public Node getParent() {
			return parent;
		}
		public void setParent(Node parent) {
			this.parent = parent;
		}
	}
	

}
