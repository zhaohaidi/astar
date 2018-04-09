package com.zhd.astar;

/**
 * 
 * @Description: 坐标
 * @author zhd
 *
 */
public class Coord {

	private int x;

	private int y;

	public Coord(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object object) {

		if (object == null)
			return false;

		if (object instanceof Coord) {
			Coord temp = (Coord) object;
			return x == temp.x && y == temp.y;
		}
		return false;

	}

}
