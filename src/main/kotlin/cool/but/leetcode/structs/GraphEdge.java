package cool.but.leetcode.common.structs;

public class GraphEdge {
	public int weight;
	public GraphNode from;
	public GraphNode to;

	public GraphEdge(int weight, GraphNode from, GraphNode to) {
		super();
		this.weight = weight;
		this.from = from;
		this.to = to;
	}

	@Override
	public String toString() {
		return "[" + from + ","
				+ to  + ","
				+ weight + "]";
	}
	
	
	
}
