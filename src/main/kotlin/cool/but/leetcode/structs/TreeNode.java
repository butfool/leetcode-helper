package cool.but.leetcode.common.structs;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode() {
		this.val = 0;
		this.left = null;
		this.right = null;
	}
	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	public TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}
