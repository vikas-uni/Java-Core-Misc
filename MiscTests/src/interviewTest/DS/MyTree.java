package interviewTest.DS;
/*
 * Binary Search Tree, is a node-based binary tree data structure which has the following properties:

The left subtree of a node contains only nodes with keys lesser than the node’s key.
The right subtree of a node contains only nodes with keys greater than the node’s key.
The left and right subtree each must also be a binary search tree.
There must be no duplicate nodes.
 */

public class MyTree {
	TreeNode tNode;
	
	public void add(int val){
		if(tNode == null){
			tNode = new TreeNode();
			tNode.setVal(val);
			return;
		}
		
		addNode(tNode, val);
		
	}
	
	private TreeNode addNode(TreeNode node, int val){
		if(node == null){
			TreeNode tn = new TreeNode();
			tn.setVal(val);
			return tn;
		}
		
		int tmp = node.getVal();
		
		if(tmp > val){
			TreeNode left = this.addNode(node.getLeftChild(), val);
			node.setLeftChild(left);
			
		}else
		{
			TreeNode right = this.addNode(node.getRightChild(), val);
			node.setRightChild(right);
		}
				
		return node;
	}
	
	public void printTree(TreeNode tree){
		if(tree == null){
			return;
		}
		System.out.println(tree.getVal());
		printTree(tree.getLeftChild());
//		System.out.println(tree.getVal());
		
		printTree(tree.getRightChild());
		
		//System.out.println(tree.getVal());
	}
	
	public static void main(String[] args) {
		MyTree myTree = new MyTree();
		
		/*TreeNode treeNode1 = new TreeNode(5);
		TreeNode treeNode2 = new TreeNode(6);
		TreeNode treeNode3 = new TreeNode(3);
		TreeNode treeNode4 = new TreeNode(8);
		TreeNode treeNode5 = new TreeNode(2);
		TreeNode treeNode6 = new TreeNode(1);
		
		treeNode1.setRightChild(treeNode2);
		treeNode1.setLeftChild(treeNode3);
		treeNode2.setRightChild(treeNode4);
		treeNode3.setLeftChild(treeNode5);
		treeNode5.setLeftChild(treeNode6);
		
		myTree.tNode = treeNode1;*/
		
		myTree.add(6);
		myTree.add(3);
		myTree.add(5);
		myTree.add(7);
		myTree.add(2);
		myTree.add(8);
		
		//System.out.println(myTree.tNode.rightChild.rightChild.val);
		myTree.printTree(myTree.tNode);
	}
	
	
	
}
class TreeNode{
	int val;
	TreeNode leftChild;
	TreeNode rightChild;
	public TreeNode(int i) {
		this.val = i;
	}
	public TreeNode() {
		// TODO Auto-generated constructor stub
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
	
}
