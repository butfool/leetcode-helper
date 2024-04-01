package cool.but.leetcode.common.structs;

public class Node {
	public int val;
	public Node next;
	public Node() {
		val = 0;
		next = null;
	}
	public Node(int val) {
		this.val = val;
		this.next = null;
	}
	public Node(int val, Node next) {
		this.val = val;
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "" + this.val;
	}
}
