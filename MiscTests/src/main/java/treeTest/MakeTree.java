package treeTest;

public class MakeTree {
char[] inorder = {'D','B','E','A','F','C'};
char[] preorder = {'A','B','D','E','C','F'};
	
public TreeNode generateTree(TreeNode c){
	
	TreeNode n = new TreeNode(c);
	return n;
}


public TreeNode genLeft(char[] in, char[] pre, int index){
	if(in[index] == 0){
		return null;
	}
	TreeNode left = new TreeNode(in[index]);
	in[index] = 0;
	return left;
}

public TreeNode genRight(char[] in, char[] pre, int index){
	if(in[index] == 0){
		return null;
	}
	TreeNode right = new TreeNode(pre[index]);
	return right;
}

}

class TreeNode {
	TreeNode left;
	TreeNode right;
	char root;
	
	public TreeNode(char root) {
		this.root = root;
	}

	public TreeNode(TreeNode c) {
		// TODO Auto-generated constructor stub
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public char getRoot() {
		return root;
	}

	public void setRoot(char root) {
		this.root = root;
	}
	
	
}
