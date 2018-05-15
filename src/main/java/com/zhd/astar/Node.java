package com.zhd.astar;

/**
 * 
 * @Description: 路径节点
 * @author zhd
 *
 */
public class Node implements Comparable<Node> {

     Coord coord; // 坐标
     Node parent; // 父结点
	 int G; // G：是个准确的值，是起点到当前结点的代价
	 int H; // H：是个估值，当前结点到目的结点的估计代价

	public Node(int x, int y) {
		this.coord = new Coord(x, y);
	}

	public Node(Coord coord, Node parent, int g, int h) {
		this.coord = coord;
		this.parent = parent;
		G = g;
		H = h;
	}

	@Override
	public int compareTo(Node o) {
		if (o == null)
			return -1;
		if (G + H > o.G + o.H)
			return 1;
		else if (G + H < o.G + o.H)
			return -1;
		return 0;
	}

}
