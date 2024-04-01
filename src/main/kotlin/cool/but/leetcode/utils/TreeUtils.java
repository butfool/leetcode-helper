package cool.but.leetcode.common.utils;


import cool.but.leetcode.common.structs.TreeNode;

public class TreeUtils {
	public static TreeNode getRandomIntTree(int max, int depth) {
		if (Math.random() < 1.0 / (depth * depth)) {
			return null;
		}
		TreeNode tree = new TreeNode((int) (Math.random() * max));
		tree.left = getRandomIntTree(max, depth - 1);
		tree.right = getRandomIntTree(max, depth - 1);
		return tree;
	}

	public static  void preOrder(TreeNode tree, int level, String LR) {
		if (tree == null) {
			return;
		}
		System.out.println("--".repeat(level) + LR + tree.val);
		preOrder(tree.left, level + 1, "L");
		preOrder(tree.right, level + 1, "R");
	}
	public static  void orderPrint(TreeNode tree, int order) {
		if (tree == null) {
			return;
		}
		if (order == 1) {
			System.out.print(tree.val + " ");
		}
		orderPrint(tree.left, order);
		if (order == 2) {
			System.out.print(tree.val + " ");
		}
		orderPrint(tree.right, order);
		if (order == 3) {
			System.out.print(tree.val + " ");
		}
	}
}
