package cool.but.leetcode.common.structs;

import java.util.ArrayList;

public class GraphNode {
	public int val;
	public int in;
	public int out;
	public ArrayList<GraphNode> nexts;
	public ArrayList<GraphEdge> edges;
	
	public GraphNode(int value) {
		this.val = value;
		in = 0;
		out = 0;
		this.nexts = new ArrayList<GraphNode>();
		this.edges = new ArrayList<GraphEdge>();
	}

	@Override
	public String toString() {
		return String.valueOf(this.val);
	}
}
