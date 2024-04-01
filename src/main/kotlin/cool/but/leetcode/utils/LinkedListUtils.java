package cool.but.leetcode.common.utils;


import cool.but.leetcode.common.structs.Node;

public class LinkedListUtils {
	public static Node orderedLinkedList(int count) {
		Node head = new Node();
		Node tmp = head;
		int total = count;
		while (count-- > 0) {
			tmp.next = new Node(total - count);
			tmp = tmp.next;
		}
		return head.next;
	}
	
	public static Node randomLinkedList(int count, int max) {
		Node head = new Node();
		Node tmp = head;
		while (count-- > 0) {
			tmp.next = new Node((int) (Math.random() * max));
			tmp = tmp.next;
		}
		return head.next;
	}
	
	// 请不要对有环的链表使用打印功能
	public static Node orderedLinkedListWithCircle(int count) {
		if (count <= 1) {
			return null;
		}
		Node head = new Node();
		Node tmp = head;
		Node inNode = null;
		double rate = 0;
		for (int i = 0; i < count; i++) {
			tmp.next = new Node(i);
			tmp = tmp.next;
			rate += 0.7 / count;
			if ((i != count - 1) && (inNode == null) && ((Math.random()) < rate)) {
				inNode = tmp;
			}
		}
		System.out.println(inNode + ":MID");
		tmp.next = inNode;
		return head.next;
	}
	
	public static String nodesToString(Node head) {
		StringBuilder sb = new StringBuilder();
		Node tmp = head;
		while (tmp != null) {
			sb.append(tmp.val);
			sb.append("->");
			tmp = tmp.next;
		}
		sb.append("END");
		return sb.toString();
	}
}
