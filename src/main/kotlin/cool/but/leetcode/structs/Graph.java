package cool.but.leetcode.common.structs;

import java.util.HashMap;
import java.util.HashSet;

public class Graph {
	public HashMap<Integer, GraphNode> nodes;
	public HashSet<GraphEdge> edges;
	public Graph() {
		this.nodes = new HashMap<>();
		this.edges = new HashSet<>();
	}
}
