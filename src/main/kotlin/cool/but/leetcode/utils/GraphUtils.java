package cool.but.leetcode.common.utils;

import cool.but.leetcode.common.structs.Graph;
import cool.but.leetcode.common.structs.GraphEdge;
import cool.but.leetcode.common.structs.GraphNode;

import java.util.Arrays;


public class GraphUtils {

	// 将矩阵转换为图
	public static Graph generateGraphFromMatrix(int[][] matrix) {
		Graph graph = new Graph();
		for (int i = 0; i < matrix.length; i++) {
			int from = matrix[i][0];
			int to = matrix[i][1];
			int weight = matrix[i][2];
			
			if (!graph.nodes.containsKey(from)) {
				graph.nodes.put(from, new GraphNode(from));
			}
			if (!graph.nodes.containsKey(to)) {
				graph.nodes.put(to, new GraphNode(to));
			}
			
			GraphNode fromNode = graph.nodes.get(from);
			GraphNode toNode = graph.nodes.get(to);
			GraphEdge edge = new GraphEdge(weight, fromNode, toNode);
			fromNode.out++;
			fromNode.edges.add(edge);
			fromNode.nexts.add(toNode);
			toNode.in++;
			graph.edges.add(edge);
		}
		return graph;
	}
	
	public static int[][] randomGenerateGraph(int nodeSize, int edgeSize, int max) {
		int[][] graph = new int[edgeSize][3];
		
		for (int i = 0; i < edgeSize; i++) {
			graph[i][0] = (int) (Math.random() * nodeSize);
			graph[i][1] = (int) (Math.random() * nodeSize);
			while (graph[i][0] == graph[i][1]) {
				graph[i][1] = (int) (Math.random() * nodeSize);
			}
			graph[i][2] = (int) (Math.random() * max);
		}
		return graph;
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int[] arr : matrix) {
			System.out.println(Arrays.toString(arr));
		}
	}
	
}


















